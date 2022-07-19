package RequiredTasks.OOP.Task1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.Assert.*;


public class SomeClassTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final SomeClass<String> list = new SomeClass<>() {{
        add("q");
        add("w");
        add("e");
        add("r");
        add("t");
        add("y");
    }};

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void returnOldVal() {
        list.clear();
        list.add("q"); //0
        list.add("w"); //1
        list.add("e"); //2
        list.add("r"); //3
        list.add("t"); //4
        list.add("y"); //5
    }

    @Test
    public void testadd() {
        list.add("add");
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String now = iterator.next();
            System.out.println(now);
        }
        assertEquals("q\nw\ne\nr\nt\ny\nadd\n", outContent.toString());
    }

    @Test
    public void testaddwithindex() {
        list.add(0, "add0");
        list.add(2, "add2");
        list.add(list.size(), "add" + (list.size()));
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals("add0\nq\nadd2\nw\ne\nr\nt\ny\nadd8\n", outContent.toString());
    }

    @Test
    public void testset() {
        list.set(0, "set0");
        list.set(2, "set2");
        list.set(list.size() - 1, "setlast");
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals("set0\nw\nset2\nr\nt\nsetlast\n", outContent.toString());
    }

    @Test
    public void testclear() {
        list.clear();
        for (var now : list) {
            System.out.println(now);
        }
        System.out.println(list.size());
        assertEquals("0\n", outContent.toString());
    }

    @Test
    public void testIsEmpty() {
        assertEquals(false, list.isEmpty());
        list.clear();
        assertEquals(true, list.isEmpty());
    }

    @Test
    public void testRemoveWithIndex() {
        assertEquals("q", list.remove(0));
        assertEquals("y", list.remove(list.size() - 1));
        assertEquals("r", list.remove(2));
    }

    @Test
    public void testRemoveWithObject() {
        assertEquals(true, list.remove("q"));
        assertEquals(true, list.remove("y"));
        assertEquals(true, list.remove("r"));
        for (var now : list) {
            System.out.println(now);
        }
        System.out.print(list.size());
        assertEquals("w\ne\nt\n3", outContent.toString());
    }

    @Test
    public void testContains() {
        assertEquals(true, list.contains("q"));
        assertEquals(true, list.contains("y"));
        assertEquals(true, list.contains("e"));
        assertEquals(false, list.contains("s"));
    }

    @Test
    public void testToArray() {
        var arr = list.toArray();
        for (var now : arr) {
            System.out.println(now);
        }
        assertEquals(arr.length, list.size());
        assertEquals("q\nw\ne\nr\nt\ny\n", outContent.toString());
    }

    @Test
    public void testAddAll() {
        ArrayList<String> add = new ArrayList<>() {{
            add("add1");
            add("add2");
        }};
        int oldSize = list.size();
        list.addAll(add);
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals(oldSize + add.size(), list.size());
        assertEquals("q\nw\ne\nr\nt\ny\nadd1\nadd2\n", outContent.toString());
    }

    @Test
    public void testAddAllwithIndex() {
        ArrayList<String> a = new ArrayList<>() {{
            add("add1");
            add("add2");
        }};
        int oldSize = list.size();
        list.addAll(2, a);
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals(oldSize + a.size(), list.size());
        assertEquals("q\nw\nadd1\nadd2\ne\nr\nt\ny\n", outContent.toString());
    }

    @Test
    public void testContainsAll() {
        ArrayList<String> c = new ArrayList<>() {{
            add("add1");
            add("add2");
        }};
        ArrayList<String> c1 = new ArrayList<>() {{
            add("q");
            add("add2");
        }};
        ArrayList<String> c2 = new ArrayList<>() {{
            add("q");
            add("w");
        }};
        assertEquals(false, list.containsAll(c));
        assertEquals(false, list.containsAll(c1));
        assertEquals(true, list.containsAll(c2));
    }

    @Test
    public void testRemoveAll() {
        ArrayList<String> a = new ArrayList<>() {{
            add("add1");
            add("add2");
        }};
        int oldSize = list.size();
        list.removeAll(a);
        for (var now : list) {
            System.out.println(now);
        }

        assertEquals(oldSize, list.size());
        assertEquals("q\nw\ne\nr\nt\ny\n", outContent.toString());

        outContent.reset();

        ArrayList<String> a1 = new ArrayList<>() {{
            add("w");
            add("y");
        }};
        list.removeAll(a1);
        for (var now : list) {
            System.out.println(now);
        }

        assertEquals(oldSize - 2, list.size());
        assertEquals("q\ne\nr\nt\n", outContent.toString());
    }

    @Test
    public void testRetainAll() {
        ArrayList<String> a = new ArrayList<>() {{
            add("add1");
            add("add2");
        }};

        list.retainAll(a);
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals("", outContent.toString());
    }

    @Test
    public void testRetainAll2() {
        ArrayList<String> a = new ArrayList<>() {{
            add("w");
            add("e");
        }};

        list.retainAll(a);
        for (var now : list) {
            System.out.println(now);
        }
        assertEquals("w\ne\n", outContent.toString());
    }

    @Test
    public void testGet() {
        assertEquals("q", list.get(0));
        assertEquals("y", list.get(5));
        assertEquals("e", list.get(2));
    }

    @Test
    public void testIndexOf() {
        assertEquals(0, list.indexOf("q"));
        assertEquals(2, list.indexOf("e"));
        assertEquals(5, list.indexOf("y"));
    }

    @Test
    public void lastIndexOf() {
        assertEquals(0, list.indexOf("q"));
        assertEquals(2, list.indexOf("e"));
        assertEquals(5, list.indexOf("y"));
    }

    @Test
    public void testListIterator() {
        ListIterator<String> it = list.listIterator();
        assertEquals(list.get(0), it.next()); //q
        assertEquals(list.get(1), it.next()); // w
        assertEquals(list.get(2), it.next()); // e
        assertEquals(list.get(2), it.previous()); // e
        it.set("qq"); // e -> qq
        assertEquals(list.get(2), list.get(it.nextIndex()));
        assertEquals(list.get(2), it.next());
        it.set("qqN"); // qq - qqN
        assertEquals("qqN", it.previous());
        it.set("qqP");
        assertEquals("qqP", it.next());
    }

    @Test
    public void testListIterator2() {
        ListIterator<String> it = list.listIterator();
        it.add("adding");
        assertEquals("adding", it.previous());
        while (it.hasNext()){
            it.next();
        }
        it.add("addLast");
        assertEquals("addLast", it.previous());
    }
    @Test
    public void testListIteratorWithIndex() {
        ListIterator<String> it = list.listIterator(2); // frome e r t y
        assertEquals(1, it.previousIndex());
        assertEquals(list.get(2), it.next()); //e
        assertEquals(list.get(3), it.next()); // r
        assertEquals(list.get(4), it.next()); // t
        assertEquals(list.get(4), it.previous()); // t
        it.set("qq"); // e -> qq
        assertEquals("qq", it.next());
        it.set("qq2");
        assertEquals("qq2", it.previous());
    }
}
package JavaRush.lvl4tasks.tsk5;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.Cat cat1 = new Solution.Cat("asd",12,3);
        Solution.Cat cat2 = new Solution.Cat("vfg",24,4);
        Solution.Cat cat3 = new Solution.Cat("zxc",41,6);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.print(cat2.fight(cat3));
        assertEquals("false\nfalse\nfalse", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.Cat cat1 = new Solution.Cat("asd",24,3);
        Solution.Cat cat2 = new Solution.Cat("vfg",41,4);
        Solution.Cat cat3 = new Solution.Cat("zxc",12,6);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.print(cat2.fight(cat3));
        assertEquals("false\ntrue\ntrue", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.Cat cat1 = new Solution.Cat("asd",12,3);
        Solution.Cat cat2 = new Solution.Cat("vfg",41,4);
        Solution.Cat cat3 = new Solution.Cat("zxc",24,6);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.print(cat2.fight(cat3));
        assertEquals("false\nfalse\ntrue", outContent.toString());
    }
}
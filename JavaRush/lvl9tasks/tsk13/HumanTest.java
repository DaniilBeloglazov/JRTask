package JavaRush.lvl9tasks.tsk13;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class HumanTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Human hum = new Human("Alex",21,true,2,true,30000);
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 21\n" +
                "sex true\n" +
                "countOfChilds: 2\n" +
                "work: true\n" +
                "salary: 30000", outContent.toString());
    }
    @Test
    public void test2(){
        Human hum = new Human("Alex",21,true,2,true);
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 21\n" +
                "sex true\n" +
                "countOfChilds: 2\n" +
                "work: true\n" +
                "salary: unknown", outContent.toString());
    }
    @Test
    public void test3(){
        Human hum = new Human("Alex",21,true,2);
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 21\n" +
                "sex true\n" +
                "countOfChilds: 2\n" +
                "work: null\n" +
                "salary: unknown", outContent.toString());
    }
    @Test
    public void test4(){
        Human hum = new Human("Alex",21,true);
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 21\n" +
                "sex true\n" +
                "countOfChilds: 0\n" +
                "work: null\n" +
                "salary: unknown", outContent.toString());
    }
    @Test
    public void test5(){
        Human hum = new Human("Alex",21);
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 21\n" +
                "sex null\n" +
                "countOfChilds: 0\n" +
                "work: null\n" +
                "salary: unknown", outContent.toString());
    }
    @Test
    public void test6(){
        Human hum = new Human("Alex");
        System.out.print(hum);
        assertEquals("name: Alex\n" +
                "age: 0\n" +
                "sex null\n" +
                "countOfChilds: 0\n" +
                "work: null\n" +
                "salary: unknown", outContent.toString());
    }
}
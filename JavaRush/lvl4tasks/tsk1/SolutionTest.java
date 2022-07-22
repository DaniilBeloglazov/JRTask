package JavaRush.lvl4tasks.tsk1;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.Person person = new Solution.Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(30);
        System.out.println("Adjusted Age is: " + person.age);
        assertEquals("Age is: 20\n" +
                "The Age in adjustAge() is 20\n" +
                "Adjusted Age is: 50\n", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.Person person = new Solution.Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(50);
        System.out.println("Adjusted Age is: " + person.age);
        assertEquals("Age is: 20\n" +
                "The Age in adjustAge() is 20\n" +
                "Adjusted Age is: 70\n", outContent.toString());
    }
}
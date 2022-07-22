package JavaRush.lvl8tasks.tsk4;

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
        for (int i = 0; i < 10; i++){
            System.out.println(Solution.m1()[i]);
        }
        assertEquals("java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                "com.lvl8tasks.tsk4.Solution.m9(Kata.java:29)\n" +
                "com.lvl8tasks.tsk4.Solution.m8(Kata.java:26)\n" +
                "com.lvl8tasks.tsk4.Solution.m7(Kata.java:23)\n" +
                "com.lvl8tasks.tsk4.Solution.m6(Kata.java:20)\n" +
                "com.lvl8tasks.tsk4.Solution.m5(Kata.java:17)\n" +
                "com.lvl8tasks.tsk4.Solution.m4(Kata.java:14)\n" +
                "com.lvl8tasks.tsk4.Solution.m3(Kata.java:11)\n" +
                "com.lvl8tasks.tsk4.Solution.m2(Kata.java:8)\n" +
                "com.lvl8tasks.tsk4.Solution.m1(Kata.java:5)\n", outContent.toString());
    }
}
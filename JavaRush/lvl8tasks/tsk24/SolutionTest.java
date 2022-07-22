package JavaRush.lvl8tasks.tsk24;

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
        Solution.main(null);
        for (var now : Solution.wolf.ate){
            System.out.print(now + " ");
        }
        System.out.println();
        for (var now : Solution.woodman.killed){
            System.out.print(now + " ");
        }
        assertEquals("com.lvl8tasks.tsk24.Solution$Grandmother@2eafffde com.lvl8tasks.tsk24.Solution$LittleRedRidingHood@59690aa4 \n" +
                "com.lvl8tasks.tsk24.Solution$Wolf@6842775d ", outContent.toString());
    }
}
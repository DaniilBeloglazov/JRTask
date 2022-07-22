package JavaRush.lvl5tasks.tsk17;

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
        for (int i = 0; i < 2; i++){
            Solution.Idea id = new Solution.Idea();
            Solution.Idea.printIdea(id);
        }
        assertEquals("NotEmptyNotEmpty", outContent.toString());
    }
    @Test
    public void test2(){
        for (int i = 0; i < 4; i++){
            Solution.Idea id = new Solution.Idea();
            Solution.Idea.printIdea(id);
        }
        assertEquals("NotEmptyNotEmptyNotEmptyNotEmpty", outContent.toString());
    }
}
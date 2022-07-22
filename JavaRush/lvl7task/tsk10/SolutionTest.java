package JavaRush.lvl7task.tsk10;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Solution.insert10000(arrayList);
        Solution.insert10000(linkedList);
        long timeOfArr = Solution.getTimeOfGet(arrayList);
        long timeOfLinked = Solution.getTimeOfGet(linkedList);
        System.out.print(timeOfLinked > timeOfArr);
        assertEquals("true", outContent.toString());
    }
}
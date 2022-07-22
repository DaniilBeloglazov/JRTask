package JavaRush.lvl7task.tsk19;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.createCats();
        Set<Solution.Cat> cats = Solution.createCats();
        Iterator<Solution.Cat> it = cats.iterator();
        cats.remove(it.next());
        Solution.printCats(cats);
        assertEquals("com.lvl7task.tsk19.Solution$Cat@68fb2c38\n" +
                "com.lvl7task.tsk19.Solution$Cat@567d299b\n", outContent.toString());
    }
}
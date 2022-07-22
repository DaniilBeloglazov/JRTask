package JavaRush.lvl3tasks.tsk4;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test1() {
        Solution.addNewCat();
        assertEquals("1\n", outContent.toString());
        Solution.catsCount = 0;
    }
    @Test
    public void test2() {
        Solution.addNewCat();
        Solution.addNewCat();
        assertEquals("1\n2\n", outContent.toString());
    }
}
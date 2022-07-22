package JavaRush.lvl3tasks.tsk3;
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
        Solution meth = new Solution();
        meth.setName("Viktor");
        meth.printPrivateName();
        assertEquals("Viktor", outContent.toString());
    }
}

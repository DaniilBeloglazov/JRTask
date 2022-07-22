package JavaRush.lvl3tasks.tsk6;
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
        Solution cons = new Solution();
        cons.setName("Daniil","Beloglazov");
        cons.getPrivateFullName();
        assertEquals("DaniilBeloglazov", outContent.toString());
    }
}

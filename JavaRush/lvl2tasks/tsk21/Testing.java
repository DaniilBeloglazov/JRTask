package JavaRush.lvl2tasks.tsk21;
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
        Solution.printSal(2673);
        assertEquals("Я буду зарабатывать $2673 в час", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printSal(98347);
        assertEquals("Я буду зарабатывать $98347 в час", outContent.toString());
    }
}

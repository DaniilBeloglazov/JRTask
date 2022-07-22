package JavaRush.lvl2tasks.tsk16;
import org.junit.Before;
import org.junit.Test;
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
        Solution.inPS(8,"Вася");
        assertEquals("Вася захватит мир через 8 лет. Му-ха-ха!", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.inPS(45,"Сергей");
        assertEquals("Сергей захватит мир через 45 лет. Му-ха-ха!", outContent.toString());
    }
}

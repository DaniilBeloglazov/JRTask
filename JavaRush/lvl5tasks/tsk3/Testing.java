package JavaRush.lvl5tasks.tsk3;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static JavaRush.lvl5tasks.tsk3.Cat.catCount;
import static JavaRush.lvl5tasks.tsk3.Dog.dogCount;
import static org.junit.Assert.*;


public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        for (int i = 0; i < 3_00; i++){
            new Cat();
            new Dog();
            System.gc();
        }
        System.gc();
        System.out.print(catCount +  " " + dogCount);
        boolean result = outContent.toString().contains("destroyed");
        assertEquals(true, result);
        ;
    }
}

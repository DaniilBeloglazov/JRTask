package JavaRush.lvl7task.tsk13;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++){
            set.add("л" + i);
        }
        System.out.print(set);
        assertEquals("[л19, л18, л17, л16, л15, л14, л13, л12, л11, л0, л10, л1, л2, л3, л4, л5, л6, л7, л8, л9]", outContent.toString());
    }
}
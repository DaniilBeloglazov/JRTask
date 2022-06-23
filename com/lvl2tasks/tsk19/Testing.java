package com.lvl2tasks.tsk19;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() {
        Solution.outP("Eva", "Anton", "Ulya");
        assertEquals("Eva + Anton + Ulya = Чистая любовь, да-да!", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.outP("Vasya", "Eva", "Anzhelika");
        assertEquals("Vasya + Eva + Anzhelika = Чистая любовь, да-да!", outContent.toString());
    }
}

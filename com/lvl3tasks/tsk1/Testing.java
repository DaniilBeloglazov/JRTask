package com.lvl3tasks.tsk1;
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
        Solution.main();
        assertEquals("Age is: 20\n" +
                "The Age in adjustAge() is 20\n" +
                "Adjusted Age is: 40\n", outContent.toString());
    }
}

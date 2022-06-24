package com.lvl2tasks.tsk20;
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
        Solution.printZp();
        assertEquals("Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n" +
                "Я хочу большую зарплату, и для этого изучаю Java\n", outContent.toString());

    }
}

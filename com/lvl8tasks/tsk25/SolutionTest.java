package com.lvl8tasks.tsk25;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution room = new Solution();
        room.A = 5;
        Solution.D = 5;
        System.out.print(room.getA());
        assertEquals("5", outContent.toString());
    }
}
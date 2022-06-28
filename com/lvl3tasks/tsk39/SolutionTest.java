package com.lvl3tasks.tsk39;

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
    public void test1() {
        Solution.printSheLovesMe("Света");
        assertEquals("Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n"
                + "Света любит меня.\n", outContent.toString());
    }
}
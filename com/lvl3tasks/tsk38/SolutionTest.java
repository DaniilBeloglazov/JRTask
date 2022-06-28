package com.lvl3tasks.tsk38;

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
        Solution.printHoriz8();
        Solution.printVert8();
        assertEquals("8888888888\n" + "8\n8\n8\n8\n8\n8\n8\n8\n8\n8\n", outContent.toString());
    }
}
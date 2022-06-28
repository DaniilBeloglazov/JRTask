package com.lvl3tasks.tsk31;

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
        Solution.prinTenToOne();
        assertEquals("10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n", outContent.toString());
    }
}
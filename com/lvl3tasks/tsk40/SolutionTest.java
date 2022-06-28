package com.lvl3tasks.tsk40;

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
        Solution.printIWontWork();
        String answer = "Я никогда не буду работать за копейки. Амиго\n";
        answer = answer.repeat(100);
        assertEquals(answer, outContent.toString());
    }
}
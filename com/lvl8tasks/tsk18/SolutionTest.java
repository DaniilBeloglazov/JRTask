package com.lvl8tasks.tsk18;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() throws Solution.MyException {
        try{
            throw new Solution.MyException();
        } catch (Solution.MyException e){
            e.printStackTrace();
        }
        assertEquals("", outContent.toString());
    }
}
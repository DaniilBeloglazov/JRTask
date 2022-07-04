package com.lvl8tasks.tsk13;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() throws Exception{
        try{
            Solution.method1();
        } catch (NullPointerException e) {
            System.out.print("catched");
        } catch (FileNotFoundException e){
            System.out.print("catched");
        }
        assertEquals("catched", outContent.toString());
    }
}
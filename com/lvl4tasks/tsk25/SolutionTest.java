package com.lvl4tasks.tsk25;

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
        Solution.Cat cat = new Solution.Cat();
        Solution.Dog dog = new Solution.Dog();
        System.out.print(cat + " " + dog);
        assertEquals("Cat Dog", outContent.toString());
    }
}
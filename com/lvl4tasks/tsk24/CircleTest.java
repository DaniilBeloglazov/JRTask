package com.lvl4tasks.tsk24;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class CircleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Circle circ = new Circle(3.6,3.5,6.5);
        circ.pirntData();
        assertEquals("3.6 3.5 6.5", outContent.toString());
    }
}
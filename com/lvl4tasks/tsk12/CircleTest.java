package com.lvl4tasks.tsk12;

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
        Circle circ = new Circle(4,5,6);
        System.out.print(circ.x + "" +circ.y + "" + circ.radius + "" + circ.width + circ.color);
        assertEquals("4560null", outContent.toString());
    }
    @Test
    public void test2(){
        Circle circ = new Circle(5,6,7,8);
        System.out.print(circ.x + "" +circ.y + "" + circ.radius + "" + circ.width + circ.color);
        assertEquals("5678null", outContent.toString());
    }
    @Test
    public void test3(){
        Circle circ = new Circle(6,7,8,9,"Green");
        System.out.print(circ.x + "" +circ.y + "" + circ.radius + "" + circ.width + circ.color);
        assertEquals("6789Green", outContent.toString());
    }
}
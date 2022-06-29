package com.lvl4tasks.tsk20;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;

import static org.junit.Assert.*;


public class RectangleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Rectangle rec = new Rectangle(3,4,5);
        rec.printData();
        assertEquals("3 4 5 5",outContent.toString());
    }
    @Test
    public void test2(){
        Rectangle rec = new Rectangle(3,4);
        rec.printData();
        assertEquals("3 4 0 0",outContent.toString());
    }
    @Test
    public void test3(){
        Rectangle rec = new Rectangle(3,4,5,6);
        rec.printData();
        assertEquals("3 4 5 6",outContent.toString());
    }
    @Test
    public void test4(){
        Rectangle rec = new Rectangle(5,4,5,6);
        Rectangle rec2 = new Rectangle(rec);
        rec.printData();
        assertEquals("5 4 5 6",outContent.toString());
    }

}
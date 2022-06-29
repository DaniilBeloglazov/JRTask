package com.lvl5tasks.tsk8;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print(Cat.getCatCount());
        assertEquals("0", outContent.toString());
    }
    @Test
    public void test2(){
        Cat.setCatCount(40);
        System.out.print(Cat.getCatCount());
        assertEquals("40", outContent.toString());
    }
    @Test
    public void test3(){
        Cat.setCatCount(35);
        System.out.print(Cat.getCatCount());
        assertEquals("35", outContent.toString());
    }
}
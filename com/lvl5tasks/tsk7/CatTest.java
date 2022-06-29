package com.lvl5tasks.tsk7;

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
    public void test0(){
        System.out.print(Cat.catCount);
        assertEquals("0", outContent.toString());
    }
    @Test
    public void test1(){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        System.out.print(Cat.catCount);
        assertEquals("3", outContent.toString());
    }
    @Test
    public void test3(){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.print(Cat.catCount);
        assertEquals("5", outContent.toString());
    }
}
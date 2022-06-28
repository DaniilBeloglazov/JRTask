package com.lvl4tasks.tsk4;

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
        Cat cat = new Cat("Вася", 12, 12);
        System.out.print(cat.name + " " + cat.strength + " " + cat.age);
        assertEquals("Вася 12 12", outContent.toString());
    }
    @Test
    public void test2(){
        Cat cat = new Cat("Андрей", 16, 15);
        System.out.print(cat.name + " " + cat.strength + " " + cat.age);
        assertEquals("Андрей 16 15", outContent.toString());
    }
}
package com.lvl4tasks.tsk27;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class TomNJerryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        TomNJerry.Cat cat = new TomNJerry.Cat("Tom",100.0,3.0);
        System.out.print(cat);
        assertEquals("Tom 100.0 3.0", outContent.toString());
    }
    @Test
    public void test2(){
        TomNJerry.Mouse mouse = new TomNJerry.Mouse("Jerry",40.0,1.0);
        System.out.print(mouse);
        assertEquals("Jerry 40.0 1.0", outContent.toString());
    }
    @Test
    public void test3(){
        TomNJerry.Dog dog = new TomNJerry.Dog("Barboss",150.0,5.0);
        System.out.print(dog);
        assertEquals("Barboss 150.0 5.0", outContent.toString());
    }
}
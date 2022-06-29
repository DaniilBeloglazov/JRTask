package com.lvl4tasks.tsk17;

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
        Cat cat = new Cat("Yor");
        cat.printData();
        assertEquals("Yor 4 20 white null", outContent.toString());
    }
    @Test
    public void test2(){
        Cat cat = new Cat("Yor",20,6);
        cat.printData();
        assertEquals("Yor 6 20 white null", outContent.toString());
    }
    @Test
    public void test3(){
        Cat cat = new Cat("Yor",6);
        cat.printData();
        assertEquals("Yor 6 20 white null", outContent.toString());
    }
    @Test
    public void test4(){
        Cat cat = new Cat(3,"Gray");
        cat.printData();
        assertEquals("null 4 3 Gray null", outContent.toString());
    }
    @Test
    public void test5(){
        Cat cat = new Cat(3,"Gray","Coop Street 9");
        cat.printData();
        assertEquals("null 4 20 Gray Coop Street 9", outContent.toString());
    }
}
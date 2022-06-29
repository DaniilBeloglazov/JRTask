package com.lvl4tasks.tsk18;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Dog doggo = new Dog("Alex");
        doggo.printData();
        assertEquals("Alex 0 null", outContent.toString());
    }
    @Test
    public void test2(){
        Dog doggo = new Dog("Alex", 120);
        doggo.printData();
        assertEquals("Alex 120 null", outContent.toString());
    }
    @Test
    public void test3(){
        Dog doggo = new Dog("Alex",120,"Gray");
        doggo.printData();
        assertEquals("Alex 120 Gray", outContent.toString());
    }
}
package com.lvl4tasks.tsk3;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Dog doggo = new Dog();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        doggo.setAge(45);
        doggo.setName("Asket");
        System.out.println (doggo.getName());
        System.out.print (doggo.getAge());
        assertEquals("Asket\n45", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.println (doggo.getName());
        System.out.print (doggo.getAge());
        assertEquals("Asket\n45", outContent.toString());
    }
}
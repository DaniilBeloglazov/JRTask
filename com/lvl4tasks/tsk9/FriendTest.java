package com.lvl4tasks.tsk9;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class FriendTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Friend fr = new Friend("Asket");
        assertEquals("", outContent.toString());
    }
    @Test
    public void test2(){
        Friend fr = new Friend("Fim",30);
        System.out.print(fr.name + " " + fr.age);
        assertEquals("Fim 30", outContent.toString());
    }
    @Test
    public void test3(){
        Friend fr = new Friend("Tim",28,'M');
        System.out.print(fr.name + " " + fr.age + " " + fr.sex);
        assertEquals("Tim 28 M", outContent.toString());
    }
}
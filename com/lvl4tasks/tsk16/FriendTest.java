package com.lvl4tasks.tsk16;

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
        Friend fr = new Friend("Antony");
        System.out.print(fr.name + " " + fr.age + " " + fr.sex);
        assertEquals("Antony 0 \0", outContent.toString());
    }
    @Test
    public void test2(){
        Friend fr = new Friend("Antony",22);
        System.out.print(fr.name + " " + fr.age + " " + fr.sex);
        assertEquals("Antony 22 \0", outContent.toString());
    }
    @Test
    public void test3(){
        Friend fr = new Friend("Antony",23,'M');
        System.out.print(fr.name + " " + fr.age + " " + fr.sex);
        assertEquals("Antony 23 M", outContent.toString());
    }
}
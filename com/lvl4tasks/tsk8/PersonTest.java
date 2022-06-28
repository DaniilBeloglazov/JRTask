package com.lvl4tasks.tsk8;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class PersonTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Person pers1 = new Person();
        pers1.setAge(20);
        pers1.setName("Dan");
        pers1.setSex('M');
        System.out.print(pers1.getName() + " " + pers1.getSex() + " " + pers1.getAge());
        assertEquals("Dan M 20", outContent.toString());
    }
    @Test
    public void test2(){
        Person pers1 = new Person();
        pers1.setAge(23);
        pers1.setName("Ksu");
        pers1.setSex('W');
        System.out.print(pers1.getName() + " " + pers1.getSex() + " " + pers1.getAge());
        assertEquals("Ksu W 23", outContent.toString());
    }
}
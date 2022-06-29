package com.lvl4tasks.tsk15;

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
        Person ant = new Person();
        ant.initialize("Antony",100,'M',60,40.5);
        System.out.print(ant.name + " " + ant.money + " " + ant.sex + " " +ant.weight + " " + ant.size);
        assertEquals("Antony 100 M 60 40.5", outContent.toString());
    }
}
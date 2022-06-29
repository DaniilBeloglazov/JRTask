package com.lvl5tasks.tsk10;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class ConsoleReaderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print(ConsoleReader.readString("Hello"));
        assertEquals("Hello", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(ConsoleReader.readInt(245));
        assertEquals("245", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(ConsoleReader.readBoolean(true));
        assertEquals("true", outContent.toString());
    }
    @Test
    public void test4(){
        System.out.print(ConsoleReader.readDouble(6.87));
        assertEquals("6.87", outContent.toString());
    }
}
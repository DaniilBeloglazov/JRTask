package com.lvl4tasks.tsk6;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class PersonTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Person Andrew = new Person("Andrew", 24, 'M',"Ul street 9");
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print(Andrew.name + " " + Andrew.age + " " + Andrew.sex + " " + Andrew.address);
        assertEquals("Andrew 24 M Ul street 9", outContent.toString());
    }
}
package com.lvl5tasks.tsk18;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class KissMyShinyMetalAssTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        KissMyShinyMetalAss asd = new KissMyShinyMetalAss();
        System.out.print(asd);
        assertEquals("Obj", outContent.toString());
    }
}
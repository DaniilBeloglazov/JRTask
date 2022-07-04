package com.lvl8tasks.tsk23;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.printVowNCons("Мама мыла раму.");
        assertEquals("а а ы а а у \n" +
                "М м м л р м . ", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printVowNCons("Гена .играл! на флейте.!");
        assertEquals("е а и а а е е \n" +
                "Г н . г р л ! н ф л й т . ! ", outContent.toString());
    }
}
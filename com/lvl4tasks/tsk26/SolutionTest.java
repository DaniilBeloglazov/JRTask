package com.lvl4tasks.tsk26;

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
        Solution.Man man = new Solution.Man("Dan",24,"Cool Street 9");
        System.out.println(man);
        Solution.Woman  wom = new Solution.Woman("Ann",13,"Cool Street 9");
        System.out.print(wom);
        assertEquals("Dan 24 Cool Street 9\n" +
                "Ann 13 Cool Street 9", outContent.toString());
    }
}
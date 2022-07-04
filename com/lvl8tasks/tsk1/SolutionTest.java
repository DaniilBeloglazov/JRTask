package com.lvl8tasks.tsk1;

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
        for (int i = 0; i < 7; i++){
            System.out.println(Solution.method1()[i]);
        }
        assertEquals("java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                "com.lvl8tasks.tsk1.Solution.method5(Solution.java:27)\n" +
                "com.lvl8tasks.tsk1.Solution.method4(Solution.java:23)\n" +
                "com.lvl8tasks.tsk1.Solution.method3(Solution.java:19)\n" +
                "com.lvl8tasks.tsk1.Solution.method2(Solution.java:15)\n" +
                "com.lvl8tasks.tsk1.Solution.method1(Solution.java:11)\n" +
                "com.lvl8tasks.tsk1.SolutionTest.test1(SolutionTest.java:19)\n", outContent.toString());
    }
}
package com.lvl8tasks.tsk4;

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
        for (int i = 0; i < 10; i++){
            System.out.println(Solution.m1()[i]);
        }
        assertEquals("java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                "com.lvl8tasks.tsk4.Solution.m9(Solution.java:29)\n" +
                "com.lvl8tasks.tsk4.Solution.m8(Solution.java:26)\n" +
                "com.lvl8tasks.tsk4.Solution.m7(Solution.java:23)\n" +
                "com.lvl8tasks.tsk4.Solution.m6(Solution.java:20)\n" +
                "com.lvl8tasks.tsk4.Solution.m5(Solution.java:17)\n" +
                "com.lvl8tasks.tsk4.Solution.m4(Solution.java:14)\n" +
                "com.lvl8tasks.tsk4.Solution.m3(Solution.java:11)\n" +
                "com.lvl8tasks.tsk4.Solution.m2(Solution.java:8)\n" +
                "com.lvl8tasks.tsk4.Solution.m1(Solution.java:5)\n", outContent.toString());
    }
}
package com.lvl9tasks.tsk20;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(234);
            add(324);
            add(345);
            add(234);
            add(23);
            add(23);
            add(1);
            add(123);
            add(234);
            add(654);
            add(435);
            add(234);
            add(654);
            add(234);
            add(6543);
            add(342);
            add(6544);
            add(3426);
            add(234);
            add(43);
            add(3);
            add(34);
            add(65);
            add(657);
            add(3245);
            add(234);
            add(1);
            add(1);
        }};
        Collections.sort(list);
        System.out.println(list.get(9));
        System.out.print(list.get(10));
        assertEquals("43\n" +
                "65", outContent.toString());
    }
}

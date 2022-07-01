package com.lvl6tasks.tsk26;

import org.junit.After;
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
    @After
    public void cleanCATS(){Solution.CATS.clear();}
    @Test
    public void test1(){
        String name = "Sim";
        Solution.Cat cat = new Solution.Cat(name,12 , 13 , 1);
        Solution.CATS.add(cat);
        Solution.printList();
        assertEquals("Cat name is Sim, age is 12, weight is 13, tail = 1\n", outContent.toString());
    }
    @Test
    public void test2(){
        String name = "Dan";
        Solution.Cat cat = new Solution.Cat(name,23 , 17 , 3);
        name = "Sim";
        Solution.Cat cat2 = new Solution.Cat(name,12 , 13 , 1);
        Solution.CATS.add(cat);
        Solution.CATS.add(cat2);
        Solution.printList();
        assertEquals("Cat name is Dan, age is 23, weight is 17, tail = 3\n" +
                "Cat name is Sim, age is 12, weight is 13, tail = 1\n", outContent.toString());
    }
}
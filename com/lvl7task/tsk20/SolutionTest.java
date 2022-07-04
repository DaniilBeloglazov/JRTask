package com.lvl7task.tsk20;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Set<Solution.Cat> set = Solution.createCats();
        System.out.print(set.getClass() + " " + set.size());
        assertEquals("class com.lvl7task.tsk20.Solution$1 4", outContent.toString());
    }
    @Test
    public void test2(){
        Set<Solution.Dog> set = Solution.createDogs();
        System.out.print(set.getClass() + " " + set.size());
        assertEquals("class com.lvl7task.tsk20.Solution$2 3", outContent.toString());
    }
    @Test
    public void test3(){
        Set<Solution.Dog> setc = Solution.createDogs();
        Set<Solution.Cat> setd = Solution.createCats();
        Set<Object> set = Solution.join(setd, setc);
        System.out.print(set.getClass() + " " + set.size());
        assertEquals("class java.util.HashSet 7", outContent.toString());
    }
    @Test
    public void test4(){
        Set<Solution.Dog> setd = Solution.createDogs();
        Set<Solution.Cat> setc = Solution.createCats();
        Set<Object> set = Solution.join(setc, setd);
        Set<Object> setWoutCats = Solution.removeCats(set, setc);
        System.out.print(setWoutCats.getClass() + " " + setWoutCats.size());
        assertEquals("class java.util.HashSet 3", outContent.toString());
    }
}
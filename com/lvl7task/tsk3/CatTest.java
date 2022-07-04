package com.lvl7task.tsk3;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.*;


public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        String[] catsName = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (var cat : catsName){
            map.put(cat, new Cat(cat));
        }
        for (String name : map.keySet()){
            System.out.println(name + " - " + map.get(name));
        }
        assertEquals("борис - борис\n" +
                "гарфи - гарфи\n" +
                "мурка - мурка\n" +
                "дымка - дымка\n" +
                "босс - босс\n" +
                "серый - серый\n" +
                "визя - визя\n" +
                "снежок - снежок\n" +
                "васька - васька\n" +
                "рыжик - рыжик\n", outContent.toString());
    }
}
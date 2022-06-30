package com.lvl5tasks.tsk14;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.lvl5tasks.tsk14.Cat.printCats;
import static org.junit.Assert.*;


public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test1(){
        for (int i = 0; i < 10; i++){
            Cat.cats.add(new Cat());
        }
        printCats();
        assertEquals("Cat\nCat\nCat\nCat\nCat\nCat\nCat\nCat\nCat\nCat\n", outContent.toString());
    }
}
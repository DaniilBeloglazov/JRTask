package com.lvl3tasks.tsk43;

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
    public void test1() {
        Human Andrew = new Human("Андрей",2000,12,17);
        Andrew.printNameNBirth();
        assertEquals("Меня зовут Андрей.\n" +
                "Я родился 17.12.2000", outContent.toString());
    }
    @Test
    public void test2() {
        Human Andrew = new Human("Вася",1923,8,12);
        Andrew.printNameNBirth();
        assertEquals("Меня зовут Вася.\n" +
                "Я родился 12.8.1923", outContent.toString());
    }
}
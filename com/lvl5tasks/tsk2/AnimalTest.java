package com.lvl5tasks.tsk2;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.lvl5tasks.tsk2.Cat.catCount;
import static com.lvl5tasks.tsk2.Dog.dogCount;
import static org.junit.Assert.*;


public class AnimalTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() throws Throwable {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.finalize();
        cat2.finalize();
        cat3.finalize();
        System.out.print(catCount + " " + dogCount);
        assertEquals("Dog was destroyed\nCat was destroyed\nCat was destroyed\n1 1", outContent.toString());
    }
}
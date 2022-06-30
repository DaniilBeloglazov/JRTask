package com.lvl5tasks.tsk21;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Cat daughter = new Cat("Alice");
        Cat mom = new Cat("AlicesMom");
        System.out.print(daughter + "\n" + mom);
        assertEquals("Cat name is Alice, no mother, no father\n" +
                "Cat name is AlicesMom, no mother, no father", outContent.toString());
    }
    @Test
    public void test2(){
        Cat grandF = new Cat("Sim");
        Cat grandM = new Cat("Angela");
        Cat dad = new Cat("Mat",null, grandF);
        Cat mom = new Cat("Ksenia", grandM, null);
        Cat son = new Cat("Dan", mom, dad);
        Cat daughter = new Cat("Julia", mom, dad);
        System.out.print(grandF + "\n" + grandM + "\n" + dad + "\n" + mom + "\n" + son + "\n" + daughter);
        assertEquals("Cat name is Sim, no mother, no father\n" +
                "Cat name is Angela, no mother, no father\n" +
                "Cat name is Mat, no mother, father is Sim\n" +
                "Cat name is Ksenia, mother is Angela, no father\n" +
                "Cat name is Dan, mother is Ksenia, father is Mat\n" +
                "Cat name is Julia, mother is Ksenia, father is Mat", outContent.toString());
    }
}
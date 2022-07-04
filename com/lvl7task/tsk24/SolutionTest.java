package com.lvl7task.tsk24;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
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
        Human ch1 = new Human("ch1",true, 12);
        Human ch2 = new Human("ch2",true,14);
        Human ch3 = new Human("ch3", false, 7);
        ArrayList<Human> list = new ArrayList<>(Arrays.asList(ch1, ch2, ch3));
        Human father = new Human ("father", true,35, list);
        Human mother = new Human ("mother", false,33, list);
        Human fathersF = new Human("fathersFather", true, 76, new ArrayList<>(Collections.singletonList(father)));
        Human fathersM = new Human("fathersMother", false, 73, new ArrayList<>(Collections.singletonList(father)));
        Human mothersF = new Human("mothersFather", true, 75, new ArrayList<>(Collections.singletonList(mother)));
        Human mothersM = new Human("mothersMother", false, 72, new ArrayList<>(Collections.singletonList(mother)));
        System.out.println(fathersF);
        System.out.println(fathersM);
        System.out.println(mothersF);
        System.out.println(mothersM);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        assertEquals("Имя: fathersFather, пол: мужской, возраст: 76, дети: , Имя: father, пол: мужской, возраст: 35, дети: , Имя: ch1, пол: мужской, возраст: 12, Имя: ch2, пол: мужской, возраст: 14, Имя: ch3, пол: женский, возраст: 7\n" +
                "Имя: fathersMother, пол: женский, возраст: 73, дети: , Имя: father, пол: мужской, возраст: 35, дети: , Имя: ch1, пол: мужской, возраст: 12, Имя: ch2, пол: мужской, возраст: 14, Имя: ch3, пол: женский, возраст: 7\n" +
                "Имя: mothersFather, пол: мужской, возраст: 75, дети: , Имя: mother, пол: женский, возраст: 33, дети: , Имя: ch1, пол: мужской, возраст: 12, Имя: ch2, пол: мужской, возраст: 14, Имя: ch3, пол: женский, возраст: 7\n" +
                "Имя: mothersMother, пол: женский, возраст: 72, дети: , Имя: mother, пол: женский, возраст: 33, дети: , Имя: ch1, пол: мужской, возраст: 12, Имя: ch2, пол: мужской, возраст: 14, Имя: ch3, пол: женский, возраст: 7\n" +
                "Имя: ch1, пол: мужской, возраст: 12\n" +
                "Имя: ch2, пол: мужской, возраст: 14\n" +
                "Имя: ch3, пол: женский, возраст: 7\n", outContent.toString());
    }
}
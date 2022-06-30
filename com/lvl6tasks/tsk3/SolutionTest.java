package com.lvl6tasks.tsk3;

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
        String[] str = new String[]{"asd","sad","asdb","thrher","dasgr","regrh","trhhtrh","thwrmh","f","ef"};
        int[] arr = new int[10];
        Solution.putLengthOfElements(str, arr);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("3\n3\n4\n6\n5\n5\n7\n6\n1\n2\n", outContent.toString());
    }
    @Test
    public void test2(){
        String[] str = new String[]{"asddaf","saddafdaf","asdb","thrher","dasgr","regrhdaf","trhhtrh","thwrmh","f","ef"};
        int[] arr = new int[10];
        Solution.putLengthOfElements(str, arr);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("6\n9\n4\n6\n5\n8\n7\n6\n1\n2\n", outContent.toString());
    }
}
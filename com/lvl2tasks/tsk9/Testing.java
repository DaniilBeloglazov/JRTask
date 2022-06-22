package com.lvl2tasks.tsk9;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void test1(){
        assertEquals(true,Solution.writeToConsole("Hello"));
    }
    @Test
    public void test2(){
        assertEquals(true,Solution.writeToConsole("Bye"));
    }
    @Test
    public void test3(){
        assertEquals(true,Solution.writeToConsole("CYA"));
    }
}

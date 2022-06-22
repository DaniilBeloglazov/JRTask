package com.lvl1tasks.tsk2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing{
    @Test
    public void test1(){assertEquals(19,Solution.sumDigitsInNumber(289),0);}
    @Test
    public void test2(){assertEquals(1,Solution.sumDigitsInNumber(100),0);}
    @Test
    public void test3(){assertEquals(15,Solution.sumDigitsInNumber(555),0);}
}

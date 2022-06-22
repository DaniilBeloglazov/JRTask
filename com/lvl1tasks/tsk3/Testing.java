package com.lvl1tasks.tsk3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void test1(){assertEquals(485,Solution.getCountSecondsPassedInCurrentHour(485),0);}
    @Test
    public void test2(){assertEquals(0,Solution.getCountSecondsPassedInCurrentHour(7200),0);}
    @Test
    public void test3(){assertEquals(285,Solution.getCountSecondsPassedInCurrentHour(7485),0);}
}

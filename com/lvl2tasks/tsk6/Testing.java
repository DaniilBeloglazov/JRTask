package com.lvl2tasks.tsk6;

import org.junit.Test;
import static org.junit.Assert.*;
public class Testing {
    @Test
    public void testzergs(){
        Solution.fillAll();
        assertEquals(10,Solution.zergs.length, 0);
        assertEquals(true,Solution.unic(Solution.zergs));
    }
    @Test
    public void testprot(){
        Solution.fillAll();
        assertEquals(5,Solution.protosses.length, 0);
        assertEquals(true,Solution.unic(Solution.protosses));
    }
    @Test
    public void testterr(){
        Solution.fillAll();
        assertEquals(12,Solution.terrans.length, 0);
        assertEquals(true,Solution.unic(Solution.terrans));
    }


}

package com.lvl1tasks.tsk1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {

    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Solution.getMetreFromCentimetre(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Solution.getMetreFromCentimetre(0), 0);
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(1, Solution.getMetreFromCentimetre(105), 0);
    }

}
package com.lvl2tasks.tsk11;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    public String[] inpS = {"Мама", "Мыла", "Раму"};
    @Test
    public void test1() {
        Solution.permute(3, inpS,"");
        assertEquals("МамаМылаРаму\nМамаРамуМыла\nМылаМамаРаму\nМылаРамуМама\nРамуМамаМыла\nРамуМылаМама\n", outContent.toString());
    }

}
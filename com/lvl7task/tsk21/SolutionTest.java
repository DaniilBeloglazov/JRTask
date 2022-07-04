package com.lvl7task.tsk21;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Map<String, String> map = new HashMap<>(){{
            put("nm","lm");
            put("nm1","lm1");
            put("nm2","lm2");
            put("nm","lm3");
            put("nm5","lm4");
            put("nm4","lm2");
            put("nm3","lm2");
            put("nm6","lm4");
            put("nm2","lm5");
            put("nm2","lm6");
        }};
        Solution.printMap(map);
        assertEquals("nm2 - lm6\n" +
                "nm1 - lm1\n" +
                "nm4 - lm2\n" +
                "nm3 - lm2\n" +
                "nm6 - lm4\n" +
                "nm5 - lm4\n" +
                "nm - lm3\n", outContent.toString());
    }
}
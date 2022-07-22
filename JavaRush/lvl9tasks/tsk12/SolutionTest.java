package JavaRush.lvl9tasks.tsk12;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        HashMap<Character, Integer> map = new HashMap<>();
        String[] str = {"мама","папа","стЕНа","стройка","доМ","люстра","лук","Пылесос","шаблон","зонт"};
        Solution.casual(str, map);
        for (var key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        assertEquals("р 2\n" +
                "с 5\n" +
                "т 4\n" +
                "у 1\n" +
                "ш 1\n" +
                "ы 1\n" +
                "ю 1\n" +
                "а 8\n" +
                "б 1\n" +
                "д 1\n" +
                "е 2\n" +
                "з 1\n" +
                "й 1\n" +
                "к 2\n" +
                "л 4\n" +
                "м 3\n" +
                "н 3\n" +
                "о 5\n" +
                "п 3\n", outContent.toString());
    }
}
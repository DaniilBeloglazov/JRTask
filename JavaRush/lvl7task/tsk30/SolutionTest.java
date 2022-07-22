package JavaRush.lvl7task.tsk30;

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
        String[] arr = new String[]{"tr","re","fbr","ntr","wef","trrth","bnrte","ntr","sdf","wef","shr","mnty","yt","yjn","htrn","trh","myu","fwae","brt","asd",};
        Solution.printAlphaOrder(arr);
        assertEquals("asd\n" +
                "bnrte\n" +
                "brt\n" +
                "fbr\n" +
                "fwae\n" +
                "htrn\n" +
                "mnty\n" +
                "myu\n" +
                "ntr\n" +
                "ntr\n" +
                "re\n" +
                "sdf\n" +
                "shr\n" +
                "tr\n" +
                "trh\n" +
                "trrth\n" +
                "wef\n" +
                "wef\n" +
                "yjn\n" +
                "yt\n", outContent.toString());
    }
    @Test
    public void test2(){
        String[] arr = new String[]{"tr","re","htrefbr","ntr","wef","thtrrth","ubnrte","nntr","ksdf","mwlef","shr","mnty","byt","pyjn","lhtrn","trh","myu","fwae","brt","asd",};
        Solution.printAlphaOrder(arr);
        assertEquals("asd\n" +
                "brt\n" +
                "byt\n" +
                "fwae\n" +
                "htrefbr\n" +
                "ksdf\n" +
                "lhtrn\n" +
                "mnty\n" +
                "mwlef\n" +
                "myu\n" +
                "nntr\n" +
                "ntr\n" +
                "pyjn\n" +
                "re\n" +
                "shr\n" +
                "thtrrth\n" +
                "tr\n" +
                "trh\n" +
                "ubnrte\n" +
                "wef\n", outContent.toString());
    }
}
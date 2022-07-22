package JavaRush.lvl2tasks.tsk10;
import org.junit.Test;
import static org.junit.Assert.*;
public class Testing {
    @Test
    public void test1(){assertEquals(3600,Solution.convertToSeconds(1), 0);}
    @Test
    public void test2(){assertEquals(10800,Solution.convertToSeconds(3), 0);}
    @Test
    public void test3(){assertEquals(14400,Solution.convertToSeconds(4), 0);}
}

package JavaRush.lvl2tasks.tsk2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void test1(){assertEquals(380.22, Solution.convertEurToUsd(6,63.37),0.001);}
    @Test
    public void test2(){assertEquals(63.37, Solution.convertEurToUsd(1,63.37),0.001);}
    @Test
    public void test3(){assertEquals(225.96, Solution.convertEurToUsd(6,37.66),0.001);}
}

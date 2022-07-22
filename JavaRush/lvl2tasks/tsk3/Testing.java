package JavaRush.lvl2tasks.tsk3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void test1(){assertEquals(14.3, Solution.addTenPercent(13),0.01);}
    @Test
    public void test2(){assertEquals(281.6, Solution.addTenPercent(256),0.01);}
    @Test
    public void test3(){assertEquals(1357.4, Solution.addTenPercent(1234),0.01);}
}

package JavaRush.lvl1tasks.tsk4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    @Test
    public void test1(){assertEquals(250000,Solution.getVolume(25,5,2),0);}
    @Test
    public void test2(){assertEquals(7000,Solution.getVolume(7,1,1),0);}
    @Test
    public void test3(){assertEquals(42000,Solution.getVolume(6,7,1),0);}

}

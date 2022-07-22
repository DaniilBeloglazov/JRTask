package JavaRush.lvl2tasks.tsk6;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class Testing {
    @BeforeClass
    public static void filling() {
    Solution.fillAll();
    System.out.print("filled");
    }
    @Test
    public void testzergs(){
        assertEquals(10,Solution.zergs.length, 0);
        assertEquals(true,Solution.unic(Solution.zergs));
    }
    @Test
    public void testprot(){
        assertEquals(5,Solution.protosses.length, 0);
        assertEquals(true,Solution.unic(Solution.protosses));
    }
    @Test
    public void testterr(){
        assertEquals(12,Solution.terrans.length, 0);
        assertEquals(true,Solution.unic(Solution.terrans));
    }
}

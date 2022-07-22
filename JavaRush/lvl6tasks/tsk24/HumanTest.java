package JavaRush.lvl6tasks.tsk24;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class HumanTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Human grandpa = new Human("gp", true, 60);
        Human grandpa1 = new Human("gp1", true, 60);
        Human grandma = new Human("gm", false, 58);
        Human grandma1 = new Human("gm1", false, 58);
        Human father = new Human("f", true, 38, grandpa, grandma);
        Human mother = new Human("m", false, 36, grandpa1, grandma1);
        Human son1 = new Human("f1", true, 18, father, mother);
        Human son2 = new Human("f2", true, 15, father, mother);
        Human son3 = new Human("f3", true, 10, father, mother);

        System.out.println(grandpa);
        System.out.println(grandpa1);
        System.out.println(grandma);
        System.out.println(grandma1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
        assertEquals("gp true 60\n" +
                "gp1 true 60\n" +
                "gm false 58\n" +
                "gm1 false 58\n" +
                "f true 38 Отец: gp Мать: gm\n" +
                "m false 36 Отец: gp1 Мать: gm1\n" +
                "f1 true 18 Отец: f Мать: m\n" +
                "f2 true 15 Отец: f Мать: m\n" +
                "f3 true 10 Отец: f Мать: m\n", outContent.toString());
    }
}
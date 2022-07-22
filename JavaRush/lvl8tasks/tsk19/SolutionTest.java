package JavaRush.lvl8tasks.tsk19;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setErr(new PrintStream(errContent));
    }
    @Test
    public void test1(){
        Solution.main(null);
        assertEquals("java.lang.ArithmeticException: / by zero\n" +
                "\tat com.lvl8tasks.tsk19.Solution.divisionByZero(Kata.java:12)\n" +
                "\tat com.lvl8tasks.tsk19.Solution.main(Kata.java:6)\n" +
                "\tat com.lvl8tasks.tsk19.SolutionTest.test1(SolutionTest.java:18)\n" +
                "\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\n" +
                "\tat java.base/java.lang.reflect.Method.invoke(Method.java:577)\n" +
                "\tat org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)\n" +
                "\tat org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)\n" +
                "\tat org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)\n" +
                "\tat org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)\n" +
                "\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n" +
                "\tat org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)\n" +
                "\tat org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)\n" +
                "\tat org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n" +
                "\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n" +
                "\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n" +
                "\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n" +
                "\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n" +
                "\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n" +
                "\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n", errContent.toString());
    }
}
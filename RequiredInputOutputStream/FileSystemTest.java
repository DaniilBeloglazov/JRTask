package RequiredInputOutputStream;

import org.junit.After;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileSystemTest {

    @After
    public void clearDirForTesting() {
        FileSystem.delete("White/ForTest/Test");
    }

    @Test
    public void test1() {
        FileSystem.create("White/ForTest/test1.txt", "White/ForTest/Test");
        assertTrue(new File("White/ForTest/Test/data/lib/pip/examples").exists());
        assertTrue(new File("White/ForTest/Test/data/lib/pip/core/build").exists());
        assertTrue(new File("White/ForTest/Test/data/lib/pip/environments").exists());
        assertTrue(new File("White/ForTest/Test/remote").exists());
    }

    @Test
    public void test2() {
        FileSystem.create("White/ForTest/test2.txt", "White/ForTest/Test");
        assertTrue(new File("White/ForTest/Test/data/lib/pip").exists());
        assertTrue(new File("White/ForTest/Test/data/lib/chip").exists());
        assertTrue(new File("White/ForTest/Test/data2/examples").exists());
        assertTrue(new File("White/ForTest/Test/data2/core").exists());
        assertTrue(new File("White/ForTest/Test/data3/build/core1").exists());
        assertTrue(new File("White/ForTest/Test/data3/build/core2").exists());
        assertTrue(new File("White/ForTest/Test/remote").exists());
    }
    @Test
    public void test3() {
        FileSystem.create("White/ForTest/test3.txt", "White/ForTest/Test");
        assertTrue(new File("White/ForTest/Test/data/core1/coreinfo").exists());
        assertTrue(new File("White/ForTest/Test/data/core2/coreinfo").exists());
        assertTrue(new File("White/ForTest/Test/data/core3").exists());
        assertTrue(new File("White/ForTest/Test/data2/build/examples").exists());
    }
}
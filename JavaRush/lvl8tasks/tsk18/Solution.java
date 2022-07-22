package JavaRush.lvl8tasks.tsk18;

import java.io.FileNotFoundException;
import java.net.SocketException;

class Solution {
    static class MyException extends FileNotFoundException{
        MyException(){
            super("MyExcep checked");
        }
    }

    static class MyException2 extends SocketException {
        MyException2(){
            super("MyExcep2 checked");
        }
    }

    static class MyException3 extends NullPointerException{
        MyException3(){
            super("MyExcep3 unchecked");
        }
    }

    static class MyException4 extends ArrayIndexOutOfBoundsException{
        MyException4(){
            super("MyExcep4 unchecked");
        }
    }
}

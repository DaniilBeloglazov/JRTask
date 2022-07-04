package com.lvl8tasks.tsk16;

import java.io.IOException;
import java.rmi.RemoteException;

class Solution {
    static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void method1() throws IOException {
        throw new IOException();
    }
    void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    void method3() throws RemoteException {
        throw new RemoteException();
    }
}

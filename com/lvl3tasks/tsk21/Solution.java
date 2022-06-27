package com.lvl3tasks.tsk21;

public class Solution {
    public static final void isEqualNmOrLn(String name1, String name2){
        if (name1.equals(name2))
            System.out.print("Имена идентичны");
        else if (name1.length() == name2.length())
            System.out.print("Длины имен равны");
    }
}

package com.lvl2tasks.tsk13;
// ROYGBIV
public class Solution {
     public static void main(String[] args) {
          Color r = new Color("Red");
          Color o = new Color("Orange");
          Color y = new Color("Yellow");
          Color g = new Color("Green");
          Color b = new Color("Blue");
          Color i = new Color("Indigo");
          Color v = new Color("Violet");
     }

     public static class Color{
          public Color(String color) {
               System.out.print(color + " ");
          }
     }
}

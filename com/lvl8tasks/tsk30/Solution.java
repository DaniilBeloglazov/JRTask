package com.lvl8tasks.tsk30;

import java.util.*;

class Solution {
    public static void main (String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList types = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        while(true){
            String input = cons.nextLine();
            if (input == ""){
                break;
            }
            try {
                int in = Integer.parseInt(input);
                ints.add(in);
                types.add("int");
            } catch (NumberFormatException e){
                strings.add(input);
                types.add("String");
            }
        }
        printSortCasual(types, strings, ints);
    }
    static void printSortCasual(ArrayList<Object> types, ArrayList<String> strings, ArrayList<Integer> ints){
        Collections.sort(strings);
        Collections.sort(ints, Collections.reverseOrder());
        Iterator<String> itS = strings.iterator();
        Iterator<Integer> itInt = ints.iterator();
        for (int i = 0; i < types.size(); i++){
            String type = (String) types.get(i);
            if (type == "String"){
                System.out.println(itS.next());
            } else {
                System.out.println(itInt.next());
            }
        }
    }
}

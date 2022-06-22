package com.lvl1tasks.tsk2;
// Сумма цифр трехзначного
public class Solution {
    public static int sumDigitsInNumber(int number){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print(sumDigitsInNumber(246));
    }
}

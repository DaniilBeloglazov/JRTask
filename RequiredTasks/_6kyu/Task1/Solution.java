package RequiredTasks._6kyu.Task1;

public class Solution {
    public int solution(int number) {
        int sum = 0;
        int k = 2;
        for (int i = 3; i < number; i += 3){
            if (i % 5 != 0){
                sum += i;
            }
            if(i + k < number){
                sum += i + k;
                k += 2;
            }
        }
        return sum;
    }
}
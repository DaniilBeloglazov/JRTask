package RequiredTasks._5kyu.Task5;

class Solution {
    static int zeros(int n) {
        int count = 0;
        int i = 5;
        while (i <= n){
            count += n / i;
            n /= i;
            i++;
        }
        return count;
    }
}
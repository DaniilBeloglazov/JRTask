package JavaRush.lvl7task.tsk12;

class Solution {
    static void checkMaxLenSubseq(int[] arr){
        int currNum = arr[0];
        int maxlen = 0;
        int currlen = 1;
        for (int i = 1; i < 10; i++){
            if (arr[i] == currNum){
                currlen++;
            } else {
                if (currlen > maxlen){
                    maxlen = currlen;
                }
                currNum = arr[i];
                currlen = 1;
            }
        }
        if (currlen > maxlen){
            maxlen = currlen;
        }
        System.out.print(maxlen);
    }
}

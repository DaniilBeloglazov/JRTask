package RequiredTasks._5kyu.Task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {
    public static void main(String[] args) {
        getPeaks(new int[]{0, 1, 2, 5, 1, 0});
    }
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        Map<String,List<Integer>> answ = new HashMap<>();
        boolean plStatus = false; // true - open false - close
        int pBegin = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1] < arr[i]){
                plStatus = true;
                pBegin = i;
            }
            if (plStatus == true && arr[i - 1] > arr[i]){
                plStatus = false;
                pos.add(pBegin);
                peaks.add(arr[pBegin]);
            }
        }
        answ.put("pos", pos);
        answ.put("peaks", peaks);
        return answ;
    }
}
package com.lvl5tasks.tsk9;

import static java.lang.Math.*;

class Solution {
    static double getDistance(int x1,int y1,int x2,int y2){
        return (sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2),2)));
    }
}

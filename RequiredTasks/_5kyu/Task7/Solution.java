package RequiredTasks._5kyu.Task7;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

        System.out.println(helper.pageCount());
        System.out.println (helper.itemCount());

        System.out.println (helper.pageItemCount(0));
        System.out.println (helper.pageItemCount(1));
        System.out.println (helper.pageItemCount(2));
        System.out.println();
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1
    }
}

package leetcode.weekly_contest.weekly_contest_488;

import java.util.ArrayList;
import java.util.List;

public class MergeAdjacentEqualElements {
    public List<Long> mergeAdjacent(int[] nums) {
        // List<Long> dup = new ArrayList<>();

        // for (long num : nums) dup.add(num);

        // boolean changed = true;

        // while(changed){
        //     changed = false;

        //     for(int i = 0; i<dup.size()-1; i++) {
        //         if(dup.get(i).equals(dup.get(i + 1))) {
        //             long sum = dup.get(i) + dup.get(i + 1);
        //             dup.set(i, sum);
        //             dup.remove(i+1);
        //             changed = true;
        //             break;
        //         }
        //     }
        // }


        // return dup;


        List<Long> s1 = new ArrayList<>();
        for(int num:nums) {
            long current = num;

            while(!s1.isEmpty() && s1.get(s1.size() - 1) == current) {
                current = s1. remove(s1.size() - 1) * 2;
            }
            s1.add(current);
        }

        return s1;
    }
}

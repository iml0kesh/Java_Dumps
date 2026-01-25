package leetcode.weekly_contest.weekly_contest_486;

import java.util.ArrayList;
import java.util.Collections;

public class RotateNonNegativeElements {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> nonNegList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0) nonNegList.add(nums[i]);
        }

        if(nonNegList.size() <= 1){
            return nums;
        }

        int noOfRotations = k % nonNegList.size();

        Collections.rotate(nonNegList, -noOfRotations);

        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0) {
                nums[i] = nonNegList.get(idx);
                idx++;
            }
        }
        return nums;
    }
}

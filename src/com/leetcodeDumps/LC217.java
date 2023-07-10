package com.leetcodeDumps;

import java.util.HashSet;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

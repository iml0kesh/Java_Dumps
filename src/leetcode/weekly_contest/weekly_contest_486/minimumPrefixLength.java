package leetcode.weekly_contest.weekly_contest_486;

// Q1. Minimum Prefix Removal to Make Array Strictly Increasing©leetcode

public class minimumPrefixLength {
    public int minimumPrefixLength_method(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] >= nums[i]) {
                return i;
            }
        }
        return 0;
    }
}
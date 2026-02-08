package leetcode.weekly_contest.weekly_contest_488;

public class CountDominantIndices {

    public static void main(String[] args) {
        CountDominantIndices obj = new CountDominantIndices();

        int[] nums1 = {5, 4, 3};
        int[] nums2 = {4, 1, 2};

        System.out.println("Output for [5,4,3]: " + obj.dominantIndices(nums1));
        System.out.println("Output for [4,1,2]: " + obj.dominantIndices(nums2));
    }

    public int dominantIndices(int[] nums) {
        int c = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            int elements = 0;

            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                elements++;
            }

            double avg = (double) sum / elements;

            if (nums[i] > avg) c++;
        }
        return c;
    }
}

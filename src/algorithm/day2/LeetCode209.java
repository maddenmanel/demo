package algorithm.day2;

import java.util.Arrays;

public class LeetCode209 {


    private int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= target) {
                    System.out.println(nums[i] + ":" + nums[j]);
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(ans);
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        int target = 20;
        int[] nums = new int[]{1,2,3,4,5,6,7};
        LeetCode209 leetcode209 = new LeetCode209();
        leetcode209.minSubArrayLen(target, nums);
    }
}

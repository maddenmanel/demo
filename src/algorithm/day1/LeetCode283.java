package algorithm.day1;

import java.util.Arrays;

public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        LeetCode283 leetCode283 = new LeetCode283();
        leetCode283.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

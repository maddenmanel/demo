package algorithm.day1;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + ":" +j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }





    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        leetCode1.twoSum1(new int[]{2, 7, 11, 15}, 9);
    }


}

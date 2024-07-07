package algorithm.day1;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : numSet) {
            if (numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 0;
                while (numSet.contains(currentNum + 1)) {
                    currentStreak++;
                    currentNum++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);
        return longestStreak;
    }


    public static void main(String[] args) {
        LeetCode128 leetCode128 = new LeetCode128();
        System.out.println(leetCode128.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}

package algorithm.day1;

import java.util.Arrays;

public class LeetCode88 {

    private void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i !=n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        if (p1 < m || p2 < n) {
            cur = nums1[p2++];
        }

    }



    public static void main(String[] args) {
        LeetCode88 leetCode88 = new LeetCode88();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m=3;
        int n=3;
        leetCode88.merge1(nums1, m, nums2, n);
    }
}

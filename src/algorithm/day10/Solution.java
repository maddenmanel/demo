package algorithm.day10;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()){
            cnt[c - 'a'] ++;
        }

        for (char c : ransomNote.toCharArray()){
            cnt[c - 'a'] --;
            if (cnt[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.canConstruct("aa", "aab");
        int[] a = new int[26];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println(a[0] -'a');
        System.out.println(0 - 'a');



        System.out.println();
    }

}

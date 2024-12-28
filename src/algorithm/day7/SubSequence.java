package algorithm.day7;

public class SubSequence {

    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i ++;
            }
            j++;
        }
        return i == n;
    }

    public static void main(String[] args) {
        SubSequence subSequence = new SubSequence();
        System.out.println(subSequence.isSubsequence("abc", "bac"));
    }
}

package algorithm.day3;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    Map<Character, Integer> symbalValues = new HashMap<Character, Integer>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
    private int ranmanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            int value = symbalValues.get(s.charAt(i));
            if (i< n -1 && value < symbalValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        String s = "MCMXCIV";
        LeetCode13 leetCode13 = new LeetCode13();
        leetCode13.ranmanToInt(s);


    }
}

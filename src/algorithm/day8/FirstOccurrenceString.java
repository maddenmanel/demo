package algorithm.day8;

public class FirstOccurrenceString {
    public int strStr(String haystack, String needle){
        int n = haystack.length(), m = needle.length();
        char[] chars = haystack.toCharArray(), p = needle.toCharArray();
        // 枚举原串的发起点
        for(int i = 0; i <= n - m; i++){
            int a = i, b = 0;
            while (b < m && chars[a] == p[b]){
                a++;
                b++;
            }
            if (b == m){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        FirstOccurrenceString firstOccurrenceString = new FirstOccurrenceString();
        System.out.println(firstOccurrenceString.strStr("hello", "ll"));
    }
}

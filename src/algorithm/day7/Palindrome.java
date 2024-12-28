package algorithm.day7;

public class Palindrome {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        int len = sb.length();
        for (int i = 0; i < len; i++) {
            char c = sb.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        StringBuffer sbRev = new StringBuffer(sb).reverse();
        return sb.toString().equals(sbRev.toString());
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("abaabac"));
    }
}

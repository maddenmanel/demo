package algorithm.day7;

public class DoublePoint {
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for(int i = 0 ; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }

        int n = sgood.length();
        int left = 0, right = n -1;
        while (left < right) {
            if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))){
                return false;
            }

            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
        DoublePoint DoublePoint = new DoublePoint();
        System.out.println(DoublePoint.isPalindrome("A man, a plan, a canal: Panama"));
    }
}

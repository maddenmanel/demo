package algorithm.day7;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index --;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index --;
        }
        System.out.println(wordLength);
        return wordLength;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        lengthOfLastWord.lengthOfLastWord("Hello World");
    }

}

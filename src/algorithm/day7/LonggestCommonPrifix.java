package algorithm.day7;

public class LonggestCommonPrifix {
    public static void main(String[] args) {
        LonggestCommonPrifix longgestCommonPrifix = new LonggestCommonPrifix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longgestCommonPrifix.longgestCommonPrifix(strs));
    }

    private String longgestCommonPrifix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

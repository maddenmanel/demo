package algorithm.day1;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }
        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        LeetCode49 leetCode49 = new LeetCode49();
        leetCode49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}

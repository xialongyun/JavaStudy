package main.code.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class _290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] splitStr = s.split(" ");
        int pLength = pattern.length();
        int sLength = splitStr.length;
        if (pLength != sLength) {
            return false;
        }
        String[] map = new String[26];
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < pLength; i++) {
            int index = pattern.charAt(i) - 'a';
            if (map[index] == null && !hashMap.containsKey(splitStr[i])) {
                map[index] = splitStr[i];
                hashMap.put(splitStr[i], index);
            } else if (hashMap.containsKey(splitStr[i]) && map[index] != null){
                if (!map[index].equals(splitStr[i])) {
                    return false;
                }
                if (hashMap.get(splitStr[i]) != index) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}

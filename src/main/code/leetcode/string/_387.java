package main.code.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class _387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.replace(s.charAt(i),-1);
            }
        }
        for(int j = 0; j < s.length(); j++) {
            if(map.containsValue(j)) {
                return j;
            }
        }
        return -1;
    }
}

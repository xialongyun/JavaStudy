package main.code.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLength = ransomNote.length();
        int mLength = magazine.length();
        if(rLength > mLength) {
            return false;
        }
        Map<Character, Integer> rMap= new HashMap<Character, Integer>();
        Map<Character, Integer> mMap= new HashMap<Character, Integer>();
        for(int i = 0; i < rLength; i++) {
            if(rMap.containsKey(ransomNote.charAt(i))) {
                rMap.replace(ransomNote.charAt(i), rMap.get(ransomNote.charAt(i)) + 1);
            } else {
                rMap.put(ransomNote.charAt(i), 1);
            }
        }
        for(int j = 0; j < mLength; j++) {
            if(mMap.containsKey(magazine.charAt(j))) {
                mMap.replace(magazine.charAt(j), mMap.get(magazine.charAt(j)) + 1);
            } else {
                mMap.put(magazine.charAt(j), 1);
            }
        }
        if(rMap.size() > mMap.size()) {
            return false;
        }
        for(char ch : rMap.keySet()) {
            if(!mMap.containsKey(ch)) {
                return false;
            }
            if(rMap.get(ch) > mMap.get(ch)) {
                return false;
            }
        }
        return true;
    }
}

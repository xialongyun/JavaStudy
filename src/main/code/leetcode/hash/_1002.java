package main.code.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }
    public static List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for(String word : words) {
            int[] freq = new int[26];
            for(int i = 0; i < word.length(); i++ ) {
                char ch = word.charAt(i);
                freq[ch - 'a']++;
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}

package main.code.leetcode.string;

public class _557 {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder str = new StringBuilder();
            int i = 0;
            while(i < s.length()) {
                int left = i;
                while(i < s.length() && s.charAt(i) != ' ') {
                    i++;
                }
                int right = i - 1;
                while(left <= right) {
                    str.append(s.charAt(right));
                    right--;
                }
                if(s.length() != str.length()) {
                    str.append(' ');
                    i++;
                }
            }
            return str.toString();
        }

    }
}

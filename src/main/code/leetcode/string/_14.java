package main.code.leetcode.string;

public class _14 {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int length = strs[0].length();
        if (length == 0) {
            return str;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return str;
                }
            }
            str = str + strs[0].charAt(i);
        }
        return str;
    }
}

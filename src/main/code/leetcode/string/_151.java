package main.code.leetcode.string;

public class _151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Alice    "));
    }
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        res = removeSpace(s);
        reverseString(res,0,res.length() - 1);
        reverseEachWord(res);
        return res.toString();
    }

    public static StringBuilder removeSpace(String s) {
        StringBuilder res = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        for(; start <= end; start++) {
            if(s.charAt(start) != ' ' ) {
                if (s.charAt(start + 1) == ' ') {
                    res.append(s.charAt(start));
                    res.append(s.charAt(start + 1));
                    start++;
                } else {
                    res.append(s.charAt(start));
                }
            }
        }

        return res;
    }

    public static void reverseString(StringBuilder res, int start, int end) {
        while(start < end) {
            char temp = res.charAt(start);
            res.setCharAt(start, res.charAt(end));
            res.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private static void reverseEachWord(StringBuilder res) {
        int start = 0;
        int end = 0;
        while(start < res.length()) {
            while(end < res.length() && res.charAt(end) != ' ') {
                ++end;
            }
            reverseString(res, start, end - 1);
            start = end + 1;
            ++end;
        }
    }

}

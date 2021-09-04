package main.code.leetcode.string;

public class o_05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    public static String replaceSpace(String s) {
        StringBuilder str = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == ' ') {
                str.append("%20");
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}

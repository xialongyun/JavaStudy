package main.code.leetcode.string;

import java.util.Scanner;

public class _434 {
    public static void main(String[] args) {
        System.out.println(countSegments1(
                ", , , ,        a, eaefa"));
    }

    /**
     * split
     * */
    public static int countSegments1(String s) {
        int count = 0;
        String[] strarray = s.split(" ");
        for (String x : strarray) {
            if(!"".equals(x)) {
                count++;
            }
        }
        return count;
    }
    /**
     * 计算前标
     * */
    public int countSegments2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ')&& s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    /**
     * 计算后标
     * */
    public int countSegments3(String s) {
        int count = 0;
        if (s.length() == 0) {
            return count;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                count++;
            }
        }
        if(s.charAt(s.length() - 1) != ' ') {
            count++;
        }
        return count;
    }
}

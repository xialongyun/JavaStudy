package main.code.leetcode.stack;

import java.util.Stack;

public class _1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> str = new Stack<Character>();
        StringBuffer result = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                count--;
                if (count >= 0) {
                    str.push(s.charAt(i));
                } else {
                    count++;
                }
            } else if (s.charAt(i) == '(') {
                str.push(s.charAt(i));
                count++;
            } else {
                str.push(s.charAt(i));
            }
        }
        count = 0;
        while (!str.isEmpty()) {
            Character ch = str.pop();
            if (ch == ')') {
                count++;
                result.append(ch);
            } else if (ch == '(') {
                count--;
                if (count >= 0) {
                    result.append(ch);
                } else {
                    count++;
                }
            } else {
                result.append(ch);
            }
        }
        return result.reverse().toString();
    }
}

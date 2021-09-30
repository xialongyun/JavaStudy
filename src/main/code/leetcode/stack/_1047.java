package main.code.leetcode.stack;

import java.util.Stack;

public class _1047 {
    /**
     * 使用栈
     * */
    public String removeDuplicates0(String s) {
        Stack<Character> stack = new Stack<Character>();
        int length = s.length();
        for(int i = 0; i < length; i++) {
            if(!stack.empty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!stack.empty()) {
            str = stack.pop() + str;
        }
        return str;
    }
    /**
     * StringBuffer()
     * */
    public String removeDuplicates1(String s) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
    /**
     *  StringBuilder()
     * */
    public String removeDuplicates2(String s) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
}

package main.code.leetcode.stack;

import java.util.Stack;

public class _20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if(stack.empty()) {
                return false;
            } else {
                char ch = stack.pop();
                switch(s.charAt(i)) {
                    case ')':
                        if(ch != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if(ch != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if(ch != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        if(!stack.empty()) {
            return false;
        }
        return true;
    }
}

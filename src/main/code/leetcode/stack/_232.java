package main.code.leetcode.stack;

import java.util.Stack;

public class _232 {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    int i = 0;

    public _232() {
        i = 0;
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {
        if(i != 0) {
            swap();
        }
        inStack.push(x);
    }

    public int pop() {
        if(i != 1) {
            swap();
        }
        return outStack.pop();
    }

    public int peek() {
        if(i != 1) {
            swap();
        }
        return outStack.peek();
    }

    public boolean empty() {
        if(inStack.empty() && outStack.empty()) {
            return true;
        }
        return false;
    }
    public void swap() {
        if(i == 0) {
            while(!inStack.empty()) {
                outStack.push(inStack.pop());
            }
            i = 1;
        } else {
            while(!outStack.empty()) {
                inStack.push(outStack.pop());
            }
            i = 0;
        }
    }
}

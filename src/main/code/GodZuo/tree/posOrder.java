package main.code.GodZuo.tree;

import java.util.Stack;

public class posOrder {
    public static void posOrderUnRecur(Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                Node cur = stack.peek();
                if (cur.left != null && head != cur.left && head != cur.right) {
                    stack.push(cur.left);
                } else if (cur.right != null && head != cur.right) {
                    stack.push(cur.right);
                } else {
                    System.out.println(stack.pop().value);
                    head = cur;
                }
            }
        }
    }

}

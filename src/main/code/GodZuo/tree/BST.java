package main.code.GodZuo.tree;

import java.util.Stack;

public class BST {



    public static boolean checkBST(Node head) {
        int preValue = Integer.MIN_VALUE;
        if (head == null) {
            return true;
        }
        boolean isLeftBST = checkBST(head.left);
        if(!isLeftBST) {
            return false;
        }
        if(head.value <= preValue) {
            return false;
        } else {
            preValue = head.value;
        }
        return checkBST(head.right);
    }

    public static boolean checkBST1(Node head) {
        if (head != null) {
            int preValue = Integer.MIN_VALUE;
            Stack<Node> stack = new Stack<Node>();
            while(!stack.isEmpty() || head != null) {
                if(head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    if(head.value <= preValue) {
                        return false;
                    } else {
                        preValue = head.value;
                    }
                    head = head.right;
                }
            }
        }
        return true;
    }

    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value);
        inOrderRecur(head.right);
    }

    public static class  Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
}

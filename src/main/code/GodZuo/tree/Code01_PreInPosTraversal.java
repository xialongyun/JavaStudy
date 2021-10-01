package main.code.GodZuo.tree;

import java.util.Stack;
import java.util.concurrent.locks.StampedLock;

public class Code01_PreInPosTraversal {
    public static class  Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(8);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.left.left.left = new Node(1);
        head.right.left = new Node(7);
        head.right.left.left = new Node(6);
        head.right.right = new Node(10);
        head.right.right.left = new Node(9);
        head.right.right.right = new Node(11);

        preOrderRecur(head);
        inOrderUnRecur(head);
        preOrderUnRecur(head);
        posOrderUnRecur1(head);
        posOrderUnRecur2(head);
    }

    /**
     * 递归——先序遍历
     * */
    public static void preOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    /**
     * 递归——中序遍历
     * */
    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value);
        inOrderRecur(head.right);
    }

    /**
     * 递归——后序遍历
     * */
    public static void posOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.value);
    }

    /**
     * 非递归——先序遍历
     * */
    public static void preOrderUnRecur(Node head) {
        System.out.print("pre-order: ");
        if(head != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.push(head);
            while(!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.value + " ");
                if(head.right != null) {
                    stack.push(head.right);
                }
                if(head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    /**
     * 非递归——中序遍历
     * */
    public static void inOrderUnRecur(Node head) {
        System.out.print("in-order: ");
        if(head != null) {
            Stack<Node> stack = new Stack<Node>();
            while (!stack.isEmpty() || head != null) {
                if(head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    /**
     * 非递归——后序遍历1
     * */
    public static void posOrderUnRecur1(Node head) {
        System.out.print("pos-order-1: ");
        if (head != null) {
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();
            s1.push(head);
            while(!s1.isEmpty()) {
                head = s1.pop();
                s2.push(head);
                if(head.left != null) {
                    s1.push(head.left);
                }
                if(head.right != null) {
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.println(s2.pop().value + " ");
            }
        }
        System.out.println();
    }

    /**
     * 非递归——后序遍历2
     * */
    public static void posOrderUnRecur2(Node head) {
        System.out.print("pos-order-2: ");
        if (head != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.push(head);
            Node temp = null;
            while (!stack.isEmpty()) {
                temp = stack.peek();
                if(temp.left != null && head != temp.left && head != temp.right) {
                    stack.push(temp.left);
                } else if(temp.right != null && head != temp.right) {
                    stack.push(temp.right);
                } else {
                    System.out.println(stack.pop().value + " ");
                    head = temp;
                }
            }
        }
        System.out.println();
    }
}

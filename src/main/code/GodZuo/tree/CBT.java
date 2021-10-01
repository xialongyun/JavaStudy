package main.code.GodZuo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CBT {
    public static boolean isCBT(Node head) {
        if (head == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<Node>();
        boolean leaf = false;
        Node l = null;
        Node r = null;
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            l = head.left;
            r = head.right;
            if((leaf && (l != null || r != null)) || (l == null && r != null)) {
                return false;
            }
            if(l != null) {
                queue.offer(l);
            }
            if(r != null) {
                queue.offer(r);
            } else {
                leaf = true;
            }
        }
        return true;
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

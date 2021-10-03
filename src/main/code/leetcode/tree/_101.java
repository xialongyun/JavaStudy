package main.code.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _101 {
    /**
     * 递归
     * */
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
    public boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return l.val == r.val && check(l.left, r.right) && check(l.right, r.left);
    }
    /**
     * 我的笨方法
     * */
    public boolean isSymmetric0(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> left = new LinkedList<>();
        Stack<Integer> right = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while(size != 0) {
                TreeNode cur = queue.poll();
                if(cur.left != null) {
                    queue.add(cur.left);
                    left.add(cur.left.val);
                } else {
                    left.add(Integer.MIN_VALUE);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                    right.add(cur.right.val);
                } else {
                    right.add(Integer.MIN_VALUE);
                }
                size--;
            }
            if (left.size() != right.size()) {
                return false;
            }
            while (!left.isEmpty()) {
                int f = left.poll();
                int l = right.pop();
                if (f != l) {
                    return false;
                }
            }
        }
        return true;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

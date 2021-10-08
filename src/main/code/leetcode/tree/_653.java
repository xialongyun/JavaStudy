package main.code.leetcode.tree;

import java.util.Stack;

public class _653 {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        TreeNode cur = root;
        if(cur != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            while (!stack.isEmpty() || cur != null) {
                if(cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                } else {
                    cur = stack.pop();
                    if (cur.val * 2 == k) {

                    } else if (findSingleTarget(root, cur, k - cur.val)) {
                        return true;
                    }
                    cur = cur.right;
                }
            }
        }
        return false;
    }

    public boolean findSingleTarget(TreeNode root, TreeNode cur, int k) {
        if (root == null) {
            return false;
        }
        if (root.val == k) {
            return true;
        }
        return root.val < k ? findSingleTarget(root.left, cur, k) : findSingleTarget(root.right, cur, k);
    }
}

package main.code.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_posOrder {
    /**
     * 递归
     * */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    /**
     * 非递归——两个栈
     * */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root);
        if(root != null) {
            while(!s1.isEmpty()) {
                root = s1.pop();
                s2.push(root);
                if(root.left != null) {
                    s1.push(root.left);
                }
                if(root.right != null) {
                    s1.push(root.right);
                }
            }
            while(!s2.isEmpty()) {
                res.add(s2.pop().val);
            }
        }
        return res;
    }

    /**
     * 非递归——单栈
     * */
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            TreeNode temp = null;
            while(!stack.isEmpty()) {
                temp = stack.peek();
                if(temp.left != null && root != temp.right && root != temp.left) {
                    stack.push(temp.left);
                } else if(temp.right != null && root != temp.right) {
                    stack.push(temp.right);
                } else {
                    res.add(stack.pop().val);
                    root = temp;
                }
            }
        }
        return res;
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

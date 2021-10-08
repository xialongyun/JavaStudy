package main.code.leetcode.tree;

public class _700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null ) return null;
        if (root.val == val) return root;
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}

package main.code.leetcode.tree;

public class _98 {
    public long preValue = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        preValue = Long.MIN_VALUE;
        if (root == null) {
            return true;
        }
        boolean isLeftBST = isValidBST(root.left);
        if (!isLeftBST) {
            return false;
        }
        if (root.val <= preValue) {
            return false;
        } else {
            preValue = root.val;
        }
        return isValidBST(root.right);
    }
}

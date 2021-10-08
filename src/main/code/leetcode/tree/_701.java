package main.code.leetcode.tree;

public class _701 {
    /**
     * 递归
     * */
    public TreeNode insertIntoBST1(TreeNode root, int val) {
        if(root == null){
            // root == null 为终止条件，此时新建结点，并返回插入
            return new TreeNode(val);
        }
        if(root.val < val){
            // val 比root值大，对右子树结点进行递归操作
            root.right = insertIntoBST(root.right, val);
        }else{
            // val 比root值小，对左子树结点进行递归操作
            root.left = insertIntoBST(root.left, val);
        }
        // 向上层返回已经完成插入操作的结点
        return root;
    }
    /**
     * 自己的办法
     * */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode cur = root;
        TreeNode last = cur;
        boolean flag = true;
        while (cur != null) {
            if (val < cur.val) {
                flag = true;
                last = cur;
                cur = cur.left;
            } else {
                flag = false;
                last = cur;
                cur = cur.right;
            }
        }
        cur = new TreeNode(val);
        if (flag) {
            last.left = cur;
        } else {
            last.right = cur;
        }

        return root;
    }
}

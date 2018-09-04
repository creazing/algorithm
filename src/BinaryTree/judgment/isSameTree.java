package BinaryTree.judgment;


public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // 终止条件
        if (p == null || q == null) return false; // 剪枝
        return p.val == q.val // 三方合并
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}

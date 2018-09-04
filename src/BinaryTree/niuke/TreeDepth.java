package BinaryTree.niuke;

/**
 * 其实就是后续遍历
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}


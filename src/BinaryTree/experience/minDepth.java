package BinaryTree.experience;


/**
 * 当空节点有兄弟时是不计数的，所以去max值
 */
public class minDepth {
    public int minDepth(TreeNode root) {
        return minDepth(root, false);
    }
    private static int minDepth(TreeNode root, boolean hasbrother) {
        if (root == null) return hasbrother ? Integer.MAX_VALUE : 0;
        return 1 + Math.min(minDepth(root.left, root.right != null),
                minDepth(root.right, root.left != null));
    }
}

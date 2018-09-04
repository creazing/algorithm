package BinaryTree.niuke;

/**
 * 中序遍历计数第K个
 */
public class KthNode {
    TreeNode result = null;
    int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0)
            return null;
        InOrderTraversal(pRoot, k);
        return result;
    }

    private void InOrderTraversal(TreeNode root, int k) {
        if (root != null) {
            InOrderTraversal(root.left, k);
            if (++index == k) {
                result = root;
                return;
            }
            InOrderTraversal(root.right, k);
        }
    }
}

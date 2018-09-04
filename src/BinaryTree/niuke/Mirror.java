package BinaryTree.niuke;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 非递归：层次便利然后交换左右子节点
 * 递归：先序遍历，每次反转左右节点
 */
public class Mirror {
    public Mirror(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> cur = new LinkedList<TreeNode>();
        cur.offer(root);
        while(!cur.isEmpty()){
            TreeNode node = cur.poll();
            if(node.left != null)
                cur.offer(node.left);
            if(node.right != null)
                cur.offer(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
    }
    public void Mirror1(TreeNode root) {
        if(root == null) return ;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        Mirror1(root.left);
        Mirror1(root.right);
    }
}

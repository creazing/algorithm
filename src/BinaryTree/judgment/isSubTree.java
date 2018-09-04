package BinaryTree.judgment;

public class isSubTree {
    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;//原始的root2肯定不是null因为在上一个函数回直接返回，此处为null是递归基
        if(root1 == null) return false;
        if(root1.val != root2.val) return false;
        return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);
    }
}

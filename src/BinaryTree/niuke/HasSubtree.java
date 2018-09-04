package BinaryTree.niuke;

/**
 * 相当于先序遍历该树，每次先判断根节点再递归判断子节点
 * 判断是否是子树的时候也是递归调用
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null || root2 == null)
            return false;
        boolean result = false;
        if(root1.val == root2.val) result = isSubtree(root1,root2);
        //注意下面，当确定存在子树之后下面就不会再递归了
        if(result == false) result = HasSubtree(root1.left,root2);
        if(result == false) result = HasSubtree(root1.right,root2);
        return result;
    }
    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;//原始的root2肯定不是null因为在上一个函数回直接返回，此处为null是递归基
        if(root1 == null) return false;
        if(root1.val != root2.val) return false;
        return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);
    }
}
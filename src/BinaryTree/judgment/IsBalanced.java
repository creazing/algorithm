package BinaryTree.judgment;


/**
 * 平衡二叉树：它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1
 * 输的深度函数改造，如果左右字数深度超过1则返回-1，
 * 然后当左子或右子为-1（也就是不是平衡树）时直接返回-1；就是剪枝
 */
public class IsBalanced {

    public boolean IsBalanced_Solution(TreeNode root) {
        return TreeDepth(root) != -1;
    }
    public int TreeDepth(TreeNode root ) {
        if(root==null)return 0;
        int left = TreeDepth(root.left);
        if(left == -1)
            return -1;
        int right = TreeDepth(root.right);
        if(right == -1)
            return -1;
        return Math.abs(left-right)>1? -1:Math.max(left,right)+1;
    }
}

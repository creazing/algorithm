package BinaryTree.judgment;



/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSymmetrical(pRoot,pRoot);
    }
    boolean isSymmetrical(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)return true;
        if(t1==null || t2==null)return false;
        if(t1.val!=t2.val)return false;
        return isSymmetrical(t1.left,t2.right)&&isSymmetrical(t1.right,t2.left);
    }
}

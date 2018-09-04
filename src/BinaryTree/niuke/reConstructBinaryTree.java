package BinaryTree.niuke;

/**
 * 给定中序遍历和先序遍历重构二叉树
 * 每次创创建根节点，递归的遍历左子树和右子树
 */
public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    /**
     * @param pre 先序遍历数组
     * @param startPre 先序遍历数组的起始索引
     * @param endPre 先序遍历数组的结束索引
     * @param in 中序遍历数组
     * @param startIn 中序遍历数组的起始索引
     * @param endIn 中序遍历的结束索引
     * @return 二叉树的根节点
     */
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);

        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }

        return root;
    }
}
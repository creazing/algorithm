package BinaryTree.experience;

public class getNumberOfNodes {
    public static int getNumberOfNodes(TreeNode node){ //求节点数目（递归）
        if (node == null){
            return 0;
        }
        int NumLeft = getNumberOfNodes(node.left);
        int NumRight = getNumberOfNodes(node.right);
        return NumLeft+NumRight+1;
    }
}

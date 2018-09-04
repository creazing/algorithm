package BinaryTree.experience;

public class getNumberOfLeaf {
    public static int getNumberOfLeaf(TreeNode node){
        if (node == null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return 1;
        }
        return getNumberOfLeaf(node.left)+getNumberOfLeaf(node.right);

    }

}

package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while(!stk.isEmpty() || root !=null){
            while(root != null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}

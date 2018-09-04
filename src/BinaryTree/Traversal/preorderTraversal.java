package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 便利做通路且把有节点入栈，再访问栈中其他子树
 */
public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while(!stk.isEmpty() || root !=null){
            while(root != null){
                res.add(root.val);
                if(root.right != null)
                    stk.push(root.right);
                root = root.left;
            }
            if(!stk.isEmpty())
                root = stk.pop();
        }
        return res;
    }
}



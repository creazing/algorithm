package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 双栈是嘴直观的思路，第一个节点记录根节点
 * 第二个按顺序记录，先把左子树的根节点入栈，最后访问是相反的
 */
public class postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        Stack<TreeNode> stk1 = new Stack<TreeNode>();
        Stack<TreeNode> stk2 = new Stack<TreeNode>();
        stk1.push(root);
        while (!stk1.isEmpty()) {
            TreeNode node = stk1.pop();
            stk2.push(node);
            if (node.left != null)
                stk1.push(node.left);
            if (node.right != null)
                stk1.push(node.right);
        }
        while (!stk2.isEmpty()) {
            TreeNode node = stk2.pop();
            res.add(node.val);
        }
        return res;
    }
}

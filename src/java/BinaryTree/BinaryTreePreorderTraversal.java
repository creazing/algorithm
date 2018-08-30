package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 先序遍历
 * 根节点->左子->右子
 * 理解1：借助栈，先将根节点入栈，依次访问以栈中节点为根的树，
 * 规则是访问根节点—>右节点入栈—>左节点入栈，也就是每次只访
 * 问根节点
 * 理解2：依次访问树的左通路，再访问所有的右字树，这两种同时借助栈
 */
public class BinaryTreePreorderTraversal {
    /**
     * @param root
     * @return ArrayList
     * 将节点存储在ArrayList中
     */
    public static List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root != null) s.push(root);
        while (!s.isEmpty()) {
            final TreeNode p = s.pop();
            result.add(p.val);
            if (p.right != null) s.push(p.right);
            if (p.left != null) s.push(p.left);
        }
        return result;
    }

    public static List<Integer> preorderTraversal2(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> myroot = new Stack<>();
        myroot.push(root);
        while (!myroot.isEmpty()) {
            TreeNode p = myroot.pop();
            while (p != null) {
                if (p.right != null)
                    myroot.push(p.right);
                result.add(p.val);
                p = p.left;
            }
        }
        return result;
    }
}

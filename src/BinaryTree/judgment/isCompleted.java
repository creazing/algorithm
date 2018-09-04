package BinaryTree.judgment;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 完全版二叉树：倒数第二层是满的，倒数第一层在左边
 */
public class isCompleted {
    public static boolean isCompleted(TreeNode node){ //是否完全二叉树：层次遍历，若遍历到空节点时，还有节点没有遍历，则说明有空洞，不是完全二叉树
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); //跟程序遍历不同地方是：即使节点为空也先压栈，这时栈里剩下的元素必须全是空
        queue.offer(node);
        while (node != null){
            queue.offer(node.left);
            queue.offer(node.right);
            node = queue.poll();
        }
        while (!queue.isEmpty()){
            node = queue.poll();
            if (node != null){
                return false;
            }
        }
        return true;
    }
}

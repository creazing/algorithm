package niuke.BinaryTree;

import java.util.ArrayList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(root==null)return result;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode tmp=q.poll();
            result.add(tmp.val);
            if(tmp.left!=null)q.offer(tmp.left);
            if(tmp.right!=null)q.offer(tmp.right);
        }
        return result;
    }
}

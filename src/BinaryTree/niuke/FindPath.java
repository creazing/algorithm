package BinaryTree.niuke;

import java.util.ArrayList;
import java.util.Stack;

/**
 *先序遍历如果是叶节点则判断是否满足，如果不是则入栈，，左右节点访问完则出栈
 * tip：这么做栈里的元素（不包括叶节点）是一条通路
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> path = new Stack<TreeNode>();
        if(root == null)return paths;
        FindPath(root,target,path,paths);
        return paths;
    }
    private void FindPath(TreeNode root,int target,Stack<TreeNode> path,ArrayList<ArrayList<Integer>> paths ){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            if(root.val == target){

                ArrayList<Integer> list=new ArrayList<Integer>();
                for(TreeNode i:path){
                    list.add(new Integer(i.val));
                }
                list.add(new Integer(root.val));
                paths.add(list);
            }
            return ;
        }
        else{
            path.push( root);
            FindPath(root.left, target-root.val, path, paths);
            FindPath(root.right, target-root.val, path,  paths);
            path.pop();
        }
    }
}

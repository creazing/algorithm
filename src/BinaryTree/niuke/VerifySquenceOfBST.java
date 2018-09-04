package BinaryTree.niuke;

/**
 * 后续遍历的最后一个节点是根节点，前面部分肯定能分为小于根节点和
 * 大于根节点的两部分
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length==0)return false;
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    private boolean VerifySquenceOfBST(int[] s ,int start,int end){
        if(start>=end)return true;
        int left=start;
        //这两个条件都不包含等于，座椅肯定不会越界
        while(s[left]<s[end]){
            left++;//得到第一个大于等于根节点的索引
        }
        int right=left;
        while(s[right]>s[end]){
            ++right;
        }
        if(right<=end-1)return false;
        return VerifySquenceOfBST(s,start,left-1) && VerifySquenceOfBST(s,left,end-1);
    }
}

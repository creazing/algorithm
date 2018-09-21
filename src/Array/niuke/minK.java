package Array.niuke;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 问题：给定N个整数，求出最小的K个元素
 * 思路：将原始数字的相反数，求topK
 */
public class minK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result=new ArrayList<Integer>();
        if(input==null||input.length==0||k>input.length||k==0){return result;}
        PriorityQueue<Integer> MinHeap = new PriorityQueue<Integer>();
        for(int i:input){
            if(MinHeap.size()<k){MinHeap.offer(-i);}
            else{
                if(-i>MinHeap.peek()){
                    MinHeap.poll();
                    MinHeap.offer(-i);
                }
            }
        }
        while(MinHeap.size()!=0){
            result.add(-MinHeap.poll());
        }
        return result;
    }
}

package StackAndQueue;

import java.util.Stack;

/**
 * 问题：给定输入栈的顺序，和一个出栈顺序判断该出栈顺讯是否正确
 * 思路：借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，
 * 然后判断栈顶元素是不是出栈顺序的第一个元素，这里是4，很显然1≠4，
 * 所以我们继续压栈，直到相等以后开始出栈，出栈一个元素，则将出栈顺序向后移动一位，
 * 直到不相等，这样循环等压栈顺序遍历完成，如果辅助栈还不为空，说明弹出序列不是该栈的弹出顺序。
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0,j=0;i<pushA.length;i++){
            stk.push(pushA[i]);
            while(j<popA.length && stk.peek() == popA[j]){
                stk.pop();
                j++;
            }
        }
        return stk.isEmpty();
    }
}

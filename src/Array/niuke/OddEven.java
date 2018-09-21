package Array.niuke;

import java.util.ArrayList;

/**
 * 问题：把奇放在前面，且相对位置不变
 * 用一个信数组存放偶数
 */
public class OddEven {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int j =0;
        for(int i = 0;i<=array.length-1;i++){
            if(array[i]%2==1)
                array[j++]=array[i];
            else
                tmp.add(array[i]);
        }
        for(int i:tmp){
            array[j++]=i;
        }
    }
}

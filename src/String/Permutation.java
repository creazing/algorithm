package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 题目：输入一个字符串,按字典序打印出该字符串
 * 中字符的所有排列。例如输入字符串abc,则打印出
 * 由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 思路：递归的，第一个和后面的依次交换，第二个。。。一直到最后一个，最后排序以下
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if(str.length() ==0)
            return res;
        res.add(str);
        Permutation(str,0,res);

        Collections.sort(res, new Comparator<String>(){

            public int compare(String str1,String str2){

                return str1.compareTo(str2);
            }
        });
        return res;
    }
    private void Permutation(String str,int k,ArrayList<String> list){
        if(k<str.length()-1){
            int len = list.size();
            for(int i = 0;i<len;i++){
                String tmp = list.get(i);
                for(int j = k+1;j<str.length();j++){
                    StringBuffer sb = new  StringBuffer(tmp);
                    if(sb.charAt(k)!=sb.charAt(j)){
                        swap(sb,k,j);
                        list.add(sb.toString());
                    }

                }
            }
            Permutation(str,k+1,list);
        }
    }
    private void swap(StringBuffer sb ,int i,int j){
        char ch = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,ch);
    }
}


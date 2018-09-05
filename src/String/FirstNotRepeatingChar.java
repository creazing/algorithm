package String;

import java.util.HashMap;

/**
 * 问题：在一个字符串(0<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 思路：
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> mymap = new HashMap<Character,Integer>();
        for(int i = 0;i<str.length();i++){
            if(mymap.containsKey(str.charAt(i)))
                mymap.put(str.charAt(i),2);
            else
                mymap.put(str.charAt(i),1);
        }
        for(int i = 0;i<str.length();i++){
            if(mymap.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
}

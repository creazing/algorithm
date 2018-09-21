package Dynamic;

/**
 * 问题：斐波那契数列
 * f[n] =f[n-1]+f[n-2]
 * 并不需要数组，两个变量就行了
 */
public class Fibonacci {

    public int Fibonacci(int n) {
        int cur=1,pre=0;
        if(n==0){return 0;}
        if(n==1){return 1;}
        for(int i=1;i<n;i++){
            int temp =cur;
            cur=cur+pre;
            pre=temp;
        }
        return cur;
    }
}

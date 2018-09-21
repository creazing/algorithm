import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        int res = 0;
        for (int i = a; i <= b; i++) {
            Integer num = i;
            String str = num.toString();
            if (isXingyun(str)) {
                res++;
            }
        }
        System.out.println(res);

    }

    private static boolean isXingyun(String str) {
        if(str.length()==1)
            return true;
        for (int i = 0; i < (str.length()-1)/2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}







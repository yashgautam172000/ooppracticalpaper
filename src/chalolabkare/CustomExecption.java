package chalolabkare;

import java.util.Scanner;

public class CustomExecption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n,p));
    }
    public static long power(int a,int b){
        int flag =1;
        try {
            if (a==0&&b==0) throw new Myexp("n and p shouldn't be zero");
            if (a<0||b<0) throw new Myexp("either n or p should be positive");
            return (long)Math.pow(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
class Myexp extends Exception{
     Myexp(String s) {
         super(s);
    }
}

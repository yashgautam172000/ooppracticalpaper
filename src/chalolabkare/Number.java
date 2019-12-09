package chalolabkare;

public class Number {
    private double a;
    public Number(){
        a=0.0;
    }
    public Number(double a) {
        this.a = a;
    }
    public boolean isZero(){
        if(a==0.0)
            return true;
        else
            return false;
    }
    public boolean isPostive(){
        if(a>0.0)
            return true;
        else
            return false;
    }
    public boolean isNegative(){
        if(a<0.0)
            return true;
        else
            return false;
    }
    public boolean isOdd(){
        if(a%2!=0)
            return true;
        else
            return false;
    }
    public boolean isEven(){
        if(a%2==0)
            return true;
        else
            return false;
    }
    public boolean isPrime(){
        int c=0;
        for (int i = 1; i <Math.sqrt(a); i++) {
            if (a%i==0)
                ++c;
        }
        if(a==0.0)
            return true;
        else
            return false;
    }
}

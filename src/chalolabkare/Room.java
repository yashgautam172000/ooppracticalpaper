package chalolabkare;

import java.util.Scanner;

public class Room {
    private boolean AC_ON;
    private boolean HOME_THEATRE_ON;
    private boolean LIGHT_ON;
    private boolean FAN_ON;

    public Room() {
    }
    public void AC(int s){
        if(s==1) AC_ON=true;
        else AC_ON=false;
    }
    public void HOME_THEATRE(int s){
        if(s==1) HOME_THEATRE_ON=true;
        else HOME_THEATRE_ON=false;
    }
    public void LIGHT(int s){
        if(s==1) LIGHT_ON=true;
        else LIGHT_ON=false;
    }
    public void FAN(int s){
        if(s==1) FAN_ON=true;
        else FAN_ON=false;
    }
    public void CHECK(){
        int sum =0;
        if(AC_ON==true) sum+=1200;
        if(HOME_THEATRE_ON==true) sum+=600;
        if(LIGHT_ON==true) sum+=100;
        if(FAN_ON==true) sum+=400;
        System.out.println(sum);
        if(sum>=2000) System.out.println("overload");
        else System.out.println("not overload");
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Room r = new Room();
        System.out.println(" AC");
        r.AC(scan.nextInt());
        System.out.println(" HOME_THEATRE");
        r.HOME_THEATRE(scan.nextInt());
        System.out.println("LIGHT ");
        r.LIGHT(scan.nextInt());
        System.out.println(" FAN");
        r.FAN(scan.nextInt());
        r.CHECK();
    }
}
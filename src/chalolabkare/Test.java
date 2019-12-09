package chalolabkare;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[3];
        for (int i = 0; i < 3; i++) {
            String n = sc.next();
            double p = sc.nextDouble();
            st[i] = new Student(n,p);
        }
        for (int i = 0; i < 3; i++) {
            if (st[i].getPercentage()<40) System.out.println(st[i]);
        }
    }
}

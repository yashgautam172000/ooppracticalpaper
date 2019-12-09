package chalolabkare;

import java.util.Scanner;

public class Student {
    public Student() {
    }

    private String name;
    private double percentage;
    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
class Main1{
    public Main1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for (int i = 0; i < 3; i++) {
            s[i]= new Student();
            s[i].setName(sc.next());
            s[i].setPercentage(sc.nextDouble());
        }
        for (int i = 0; i < 3; i++) {
            if(s[i].getPercentage()<40.0)
            System.out.println(s[i]);
        }
    }
}
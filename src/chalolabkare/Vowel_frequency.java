package chalolabkare;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel_frequency {
    public static void main(String[] args) {
        int a = 0,e=0,i=0,o=0,u=0;
        System.out.println(a+"      "+e+"    "+i+"    "+o+"    "+u);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p = Pattern.compile("[aeiou|AEIOU]");
        Matcher m = p.matcher(s);
        String s1 = "qwertyuioplkjhgfdsazxcvbnm";
        while (m.find()){
            if (m.group().equals("a")) ++a;
            if (m.group().equals("e") )++e;
            if (m.group().equals("i") )++i;
            if (m.group().equals("o") )++o;
            if (m.group().equals("u") )++u;
        }
        System.out.println(a+"      "+e+"    "+i+"    "+o+"    "+u);
        Pattern p1= Pattern.compile("[a-z|A-Z]");
        Matcher m1= p1.matcher(s);
        while (m1.find()){
            if(s1.contains(m1.group())){
                s1=s1.replace(m1.group(),"  ");
            }
        }
        System.out.println(s1);
    }
}

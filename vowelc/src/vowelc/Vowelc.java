package vowelc;

import java.util.Scanner;

public class Vowelc {
public static void main(String[] args) {
       String c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Character");
       c=sc.next();
       switch(c)
       {
           case "a" :
           case "e" :
           case "i" :
           case "o" :
           case "u" :
               System.out.println("It's A Vowel");
               break;
           default :
               System.out.println("It's Not A Vowel");
       }

}
    
}

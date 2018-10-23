package simple;

import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
        int p, r, y,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle:- ");
        p=sc.nextInt();
        System.out.println("Enter Rate:- ");
        r=sc.nextInt();
        System.out.println("Enter Year:- ");
        y=sc.nextInt();
        si=p*r*y/100;
        System.out.println("Simple Intrest   "+si);
    }
    
}

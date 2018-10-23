package meter;

import java.util.Scanner;

public class Meter {

        public static void main(String[] args) {
            int cen,met;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Meter");
            met=sc.nextInt();
            cen=met*100;
            System.out.println(+cen+"cm");
        }
    
}

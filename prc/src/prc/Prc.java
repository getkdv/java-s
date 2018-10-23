package prc;

import java.util.Scanner;

public class Prc {
    public static void main(String[] args) {
        int amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Amount ");
        
        amount=sc.nextInt();
        if(amount<=5000)
        {
            System.out.println("You get 10% Discount");
        }
        else if (amount>10000)
                {
                    System.out.println("you get 20% discount");
                }
        else if  (amount==20000)
                        {
                            System.out.println("You get 50% discount");           
                        }
        else 
                {
                    System.out.println("Sorry");
                }
       x=8 
        
       x++   9
       ++x   9
       --x   8
       x--   8
    }
    
}
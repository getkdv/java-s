package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,fact=1,n=5;  
                
//                System.out.println("Enter Number");
//                n=sc.nextInt();
                
                for(i=1;i<=5;i++){    
                 fact=fact*i;    
  
                }    
                System.out.println("Factorial is: "+fact);    
 
    
    }  
    }
    


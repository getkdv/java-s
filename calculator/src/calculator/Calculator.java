package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        int a,b,choice,result;
    Scanner sc =new Scanner(System.in);
    
        System.out.println("Enter Your Choice");
        System.out.print("1.+");
        System.out.print("2.-");
        System.out.print("3.*");
        System.out.print("4./");
        choice=sc.nextInt();
        System.out.println("Enter Two Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
       switch(choice)
       {
           case 1 :
           
               result=a+b;
               System.out.println("Addition Of Two Numbers Are"+result);
               break;
           case 2 :
               result=a-b;
               System.out.println("Substraction Of Two Numbers Are "+result);
               break;
           case 3 :
                result=a*b;
               System.out.println("Multiplication Of Two Numbers Are "+result);
               break;
           case 4 :
               result=a/b;
               System.out.println("Division Of Two Numbers Are "+result);
               break;
       }
           
               
    
    }
    
}

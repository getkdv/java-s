package atm;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        int amount,choice = 0,withdraw, deposite;
        String answer;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Amount: ");
        amount=sc.nextInt();
       do{
           
       
        System.out.println("Enter task you want to perform ");
        
        System.out.println("1.Deposite Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 :
                System.out.println("Enter Amount You Want To Deposite");
                deposite=sc.nextInt();
                amount=amount+deposite;
                System.out.println(amount);
             break;
            case 2 :
                System.out.println("Enter Amount You Want To Withdraw");
                withdraw=sc.nextInt();
                amount=amount-withdraw;
                System.out.println(amount);
            break;
            case 3 :
                System.out.println("Available Balance Is ");
                System.out.println(amount);
                break;
            case 4 :
                System.out.println("no operation is performed ");
                break;
               
        }
        System.out.println("Do You Want To Continue y/n");
                answer=sc.next();
       }
       while(answer.equals("y"));     
    }
    
}

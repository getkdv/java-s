package inventory;

import java.util.Scanner;

public class Inventory {

  
       int jeans,tshirt,shirt;
      
       

  public static void main(String[] args) {
      int ch;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Product You Want To Buy:");
      
        System.out.println("Products Are");
        System.out.println("1.Jeans");
        System.out.println("2.T-shirt");
        System.out.println("3.Shirt");
        ch=sc.nextInt();
       
       
        switch(ch)
        {   
            case 1 :
                System.out.println("Price Of Jeans Is Rs2000 ");
            case 2 :
                System.out.println("Price Of Jeans Is Rs 3000 ");
            case 3: 
                
            
        }
         
    }
   
}

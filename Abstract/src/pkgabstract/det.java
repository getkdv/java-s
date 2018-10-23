
package pkgabstract;

import java.util.Scanner;

 class det extends Abstract {
     public void college()
     {
         System.out.println("Vivek College");
     }
           void disp()
           {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Name");
         Name=sc.next();
         System.out.println("Enter Your Age ");
         age=sc.nextInt();
         System.out.println("Name Is "+Name);
         System.out.println("Age Is "+age);
           } 
     public static void main(String[] args) {
       
       
     det obj=new det();
    
     obj.college();
     obj.course();
     obj.disp();
     
     
         
     }
     
     

}
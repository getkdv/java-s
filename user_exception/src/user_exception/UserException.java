
package user_exception;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class UserException extends Throwable {
  int age;
     Scanner sc=new Scanner(System.in);
     
          void display () throws UserException
{    System.out.println("Enter Your Age: ");
        age=sc.nextInt();
              try 
        {    
             if(age>=18)
             {
                 System.out.println("You Are Eligible To Vote");
             }
             else
             {
                 System.out.println("Sorry You Are Not Eligible");
             }
             
            throw new UserException();
        }
              catch(UserException w)
            {
                
                System.out.println("");
            }
}
    public static void main(String[] args) throws UserException {
      UserException obj=new UserException();
      obj.display();
    }
    
}

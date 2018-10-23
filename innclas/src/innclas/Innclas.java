
package innclas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Innclas {
//private String username;
//private int pass;
//class log{
//  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
//  
//    public void details() throws IOException{
//        System.out.println("Enter UserName");
//        username=b.readLine();
//        System.out.println("Enter Password");
//        pass=b.read();
//        System.out.println(" You Are Logged in");
//}
//    
//}
//    
//    public static void main(String[] args) {
//       Innclas obj =new Innclas();
//       Innclas.log lobj=obj.new log ();
//       
//    }
//   
// public static class superclass
//    {
//        static void print()
//        {
//            System.out.println("this is  super.");
//        }
//    }
//    public static class subclass extends superclass
//    {
//        static void print()
//        {
//            System.out.println("this is sub.");
//        }
//    }
// 
//    public static void main(String[] args)
//    {
//        superclass A = new superclass();
//        superclass B = new subclass();
//        A.print();
//        B.print();
//    }
void print(){
    System.out.println("this is ot");
}
class inner{
    void disp(){
        System.out.println("this is in");
    }
}
inner obj=new inner();

    public static void main(String[] args) {
     Innclas obj1=new Innclas ();
     Innclas.inner();
    }
    }




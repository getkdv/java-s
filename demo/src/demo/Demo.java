package demo;
import java.util.regex.*;
public class Demo {
    
    int a=8;
    double d=a;
    byte b=(byte)a;
    void disp()
    {
        System.out.println("this Is Display method"+d);
    }
}
    class first extends Demo{
        void print(){
            System.out.println("thus is print method");
        }


    public static void main(String[] args) {
         Demo d= new Demo();
         d.disp();
    }
    }   
//    first f= new Demo();
//    }



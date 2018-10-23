package outer1;
public class Outer1 {
    int i=50;
   class inner
   {
   void msg()
   {
       System.out.println("data is"+i);
   }
   }
   void display()
   {
   inner a=new inner();
   a.msg();
   }
   
    public static void main(String[] args) {
    Outer1 a=new Outer1();
    a.display();
    }
    
}

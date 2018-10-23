
package outer;

public abstract class Outer {

   private int a=8;
  abstract void print();
}
           
   class test 
   {
       public static void main(String[] args)
    {
        Outer o= new Outer()
        { 
            void print()
            {
                System.out.println("This is print method");
            }
        };
         o.print();
    }
       
        
       
   }

   




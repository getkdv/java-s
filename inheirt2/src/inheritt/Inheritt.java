package inheritt;
public class Inheritt 
{
   public int a=1;
   public int s=5;
   protected int g=6;
   private int j=2;
 private void print()
 {
     System.out.println("This Is Print Method"+ j);
 }
  public static void disp()
   
    {
        System.out.println("Parent Class");
    }
}
    
    class Derived extends Inheritt{
        public static void disp()
    {
        System.out.println("child class"); 
//        System.out.println(a);
//        System.out.println(s);
//        System.out.println(g);
        
    }

    public static void main(String[] args) {
        
//        Derived obj=new Derived();
//        Inheritt obj1=new Inheritt();
        Inheritt i=new Derived();
       
           i.disp();
        
}}

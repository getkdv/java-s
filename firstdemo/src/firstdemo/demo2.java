
package firstdemo;

public class demo2 {
    
    static int count=0;
    int a=5,b,c,d;
    
   public  demo2()
   {
       System.out.println("this is a default constructor");
       System.out.println(a);
   }
   public demo2(int b)
   {
       this.b=b;
       System.out.println(b);
   }
   
   public demo2(int c,int d)
   {
       this.c=c;
       this.d=d;
       System.out.println(c);
       System.out.println(d);
   }
   public demo2(demo2 s)
   {
       b=s.b;
       System.out.println(b);
   }
     void disp()
     {
         count++;
         System.out.println(count);
     }
    public static void main(String[] args) {
        demo2 obj1=new demo2();
         demo2 obj2=new demo2(8);
         demo2 obj3=new demo2(9,7);
         demo2 obj4=new demo2(obj2);
        obj1.disp();
    }
}

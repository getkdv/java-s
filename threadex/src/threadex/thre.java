package threadex;

import java.util.logging.Level;
import java.util.logging.Logger;

 class Threadex {
    public  void print(int a)
    {
        try {
            Thread.sleep(400);
      synchronized(this)
    {
    for(int i=1;i<=5;i++)
    {
      
        System.out.println(a*i);
    }
    } }catch (Exception ex) 
    {
            
        }
    }
}
    class demo extends Thread
    {
        Threadex t;
      public  demo(Threadex t)
        {
            this.t=t;
        }
        public void run()
        {
            t.print(5);
            
//            System.out.println();
        }  
    }
    class demo1 extends Thread
    {
    Threadex t;
    public demo1(Threadex t)
    {
    this.t=t;
    }
    public void run()
    {
        t.print(10);
//        System.out.println(10);
    }
    }
   public  class thre{ 
    public static void main(String[] args){
   Threadex obj= new Threadex();   
   demo d= new demo(obj);
   demo1 d1= new demo1(obj);
   d.start();
   d1.start();
    
    }
    
        
}

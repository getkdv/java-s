
package thread_ex;

public class Thread_ex implements Runnable{
    public void run()
    {
        System.out.println("Running");
    }

   
    public static void main(String[] args) {
        Thread_ex T1= new Thread_ex();
        Thread t= new Thread(T1);
        
        t.start();
       
    }
    
}

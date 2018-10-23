package prac_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Prac_concurrency {

    public static void main(String[] args) {
        AtomicInteger v=new AtomicInteger(5);
        System.out.println(v.get());
        v.getAndIncrement();
        System.out.println("after increment"+v.get());
        v.set(40);
        System.out.println("After Setting the value"+v.get());
        v.getAndDecrement();
        System.out.println("After Decrementing the value "+v.get());
        v.compareAndSet(39, 45);
        System.out.println("After update "+v.get());
    
    
    }
    
}

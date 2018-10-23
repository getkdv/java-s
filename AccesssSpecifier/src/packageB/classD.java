
package packageB;

import packageA.classA;


public class classD {
    public void abc()
    {
        System.out.println("class D method");
    }
    
    public static void main(String[] args) {
        
        classA c4=new classA();
        System.out.println(c4.a);
//        System.out.println(c4.b);
//        System.out.println(c4.c);
//        System.out.println(c4.d);
        c4.display();
        
    }
    
    
}

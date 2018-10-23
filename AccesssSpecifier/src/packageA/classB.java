
package packageA;

import packageB.classE;
import packageB.classD;
public class classB {
    public static void main(String[] args) {
        classE p1=new classE();
        p1.display2();
        classD p2=new classD();
        p2.abc();
        classA c1=new classA();
        System.out.println(c1.a);
        System.out.println(c1.c);
        System.out.println(c1.d);
        //System.out.println(c1.b);
        c1.display();
    }
   
}


package packageB;
import packageA.classA;
public class classE extends classA {
    public void display2()
    {
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
    public static void main(String[] args) {
        classE c5=new classE();
        c5.display2();
    }
    
}

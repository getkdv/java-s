
package packageA;

public class classC extends classA {
    
    public void display1()
    {
        System.out.println("a="+a);
        //System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
    
    public static void main(String[] args) {
        classC c2=new classC();
        c2.display1();
    }
}

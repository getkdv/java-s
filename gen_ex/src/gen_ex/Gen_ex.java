
package gen_ex;

public class Gen_ex<T,Q> {
    T a;
    Q b;
    void setvalue (T a,Q b)
    {
         this.a=a;
         this.b=b;
    }
    T getvlaue()
    {
        System.out.println("the Value of the int is: "+a);
        System.out.println(""+b);
        return a;
       
    }
    public static void main(String[] args) 
    {
    Gen_ex<Integer,String> obj=new Gen_ex<>();
    obj.setvalue(25,"Hello");
    obj.getvlaue();
    Gen_ex<String,Integer> obj1=new Gen_ex<>();
     obj1.setvalue("Bye",23);
    obj1.getvlaue();
    }
}

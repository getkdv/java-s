
package gen_prac;



public class Gen_prac<T> {
    private T t;
     
    public T getT(){
        return t;
    }
     public void setT(T t) {
        this.t = t;
    }
    
    public static void main(String[] args) {
           Gen_prac<Integer> ob = new Gen_prac<Integer>();
       ob.setT(07);
        System.out.println(ob.getT());
        
        
        Gen_prac<String> obj = new Gen_prac<String>();
       obj.setT("karan");
        System.out.println(obj.getT());

        
     
        
       
    }

    
}

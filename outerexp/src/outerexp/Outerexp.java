package outerexp;

public class Outerexp {
            private int a=10;
            private int b=5;
           int sum;
            class sum{
                void sum(){
                sum=a+b;
                    
            }
                
            }
    public static void main(String[] args) {
        Outerexp obj=new Outerexp();
        Outerexp.sum sobj=obj.new sum();
    }
    
}

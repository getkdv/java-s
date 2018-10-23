package gen_prac;
public class genex <A,B>{
    private A s;
    private B s2;
    public genex(A j,B k)
    {
        s=j;
        s2=k; 
    }
    public A getFirst() {
        return s;
    }
    public B getSecond(){
        return s2;
    }
    public static void main(String[] args) {
        genex<String,Integer> obj=new genex<String,Integer>("karan",07);
        System.out.println(obj.getFirst()+" "+obj.getSecond());
        genex<Integer,String> obj1=new genex<Integer,String>(07,"karan");
        System.out.println(obj.getSecond()+" "+obj.getFirst());
    }
}

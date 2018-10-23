package pkginterface;

public interface  Interface {
    void print();
    void show();
}
class jb implements Interface
{
    public void print(){System.out.println("Welcome");}
    public void show(){System.out.println("To Niit ");}
    public static void main(String[] args) {
        jb obj=new jb();
        obj.print();
        obj.show();
    }
}


class practise {
    
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends practise {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
public  class Main {
    public static void main(String[] args) {
        practise b = new Derived();;
        b.show();
    }
}



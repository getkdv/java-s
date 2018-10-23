package motor;

abstract class Motor {
Motor(int a)
{    this();
    System.out.println("motor started"+a);
} 
Motor()
{
   
    System.out.println("This is default");
}
abstract void started();
void gearpressed(){System.out.println("gear changed");}
}

class Engine extends Motor{
    Engine(int a)
    {
        super(a);
                
    }
    void started()
    {
        System.out.println("Motor is running");
    }


    public static void main(String[] args) {
       
        Engine obj2=new Engine(10);
        obj2.started();
        
    }
    
}

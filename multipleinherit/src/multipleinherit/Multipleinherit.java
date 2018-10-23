package multipleinherit;

interface Multipleinherit 
{
         void print();
         void run();
}
    interface multiple extends Multipleinherit
    {
       
        void start();
    } 
interface multi extends  Multipleinherit
{
        void started();
}

class jb implements Multipleinherit
    {
        public void print()
        {
            System.out.println("abc");
        }
        public void run()
        {
            System.out.println("asd");
        }
    
    

    public static void main(String[] args) {
      jb obj=new jb();
      obj.print();
      obj.run();
    }
    }


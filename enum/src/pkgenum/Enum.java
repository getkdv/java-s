package pkgenum;

import pkgenum.Enum.direction;

public class Enum {
enum direction{north(2),south(3),east(7),west(8);

int a;
direction(int a)
{
    this.a=a;
}
int display(){
    System.out.println(a);
    return a;
}
    

}
}
class test{

    public static void main(String[] args) {
        for(direction d:direction.values())
        {
            System.out.println(d);
//            d.display();;
        }
        System.out.println(direction.south);
 direction d1=direction.east;
 
 d1.display();
    }
    
}

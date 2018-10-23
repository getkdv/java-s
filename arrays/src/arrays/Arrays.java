
package arrays;

import java.util.Scanner;

public class Arrays {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int a[][]={{1,3},{6,4}};
       int d[]= new int[6];
       System.out.println("Enter Arrays");
       // int sum=0;
        //double avg=0;
        //System.out.println(a[1][0]);
       for(int i=0;i<6;i++)
          {
                  d[i]=sc.nextInt();
          }
        /*System.out.println("Array values are:");
         for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.println(a[i][j]);
                    sum=sum+a[i][j];
                    avg=sum/a.length;
                  continue;
            }
            }
        System.out.println(sum);
        System.out.println(avg);
                */
      String a[]={"dell","microsoft","acer","circle","zenith"};
        
      for(int j=0;j<5;j++ )
      {
          System.out.println(a[3]);
      }
      
    }
    
}
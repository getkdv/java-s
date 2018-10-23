
package fibonaccii;

import java.util.Scanner;
 public class matrix
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int m[][]=new int[2][2];
    int n[][]=new int[2][2];
    int p[][]=new int[2][2];
    for(int i=0;i<2;i++)
    {
         for(int j=0;j<2;j++)
         {    
        System.out.print("enter value:");
        m[i][j]=sc.nextInt();
         }   
    }
    for(int i=0;i<2;i++)
    {
         for(int j=0;j<2;j++)
         {    
        System.out.print("enter value:");
        n[i][j]=sc.nextInt();
         }   
    }
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            int temp=0;
            int a=0;
            for(int k=0;k<2;k++)
            {
                temp=m[i][k]*n[k][j];
                a+=temp;
            }
            p[i][j]=a;
        }
    }
    
    for(int i=0;i<2;i++)
    {
         for(int j=0;j<2;j++)
         {    
        
             System.out.println(p[i][j]);
         }   
    }

    }
}


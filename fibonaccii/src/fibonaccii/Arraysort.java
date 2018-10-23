
package fibonaccii;
import java.util.Scanner;
public class Arraysort {
   
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s;
int a[]=new int[5];
for(int i=0;i<5;i++)
{
System.out.print("enter number :");
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{	
	if(a[i]>a[j])
	{
		s=a[i];
		a[i]=a[j];
		a[j]=s;
	}
	}
}
        for(int i=0;i<a.length;i++)
        {
            System.out.println("sorted array:"+a[i]);   
        }
	
}
}

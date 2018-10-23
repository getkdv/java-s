package output;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Output {
Scanner s=new Scanner(System.in);
    String name=s.nextLine("welcome");
    
    public static void main(String[] args) {
    try
    {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\student\\Desktop\\j.txt");
       
        String s="welcome to niit";
        byte b[]=s.getBytes();
           
        fout.write(b);
        System.out.println("written");
    
    }
    catch(Exception e)
    {
        
    }
    }
    
}

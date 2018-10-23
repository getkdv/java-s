
package bufferwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Bufferwriter {


    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("E:\\karan java\\jdvc\\abc.txt");
        BufferedWriter b=new BufferedWriter(fw);
        
        String Country[]={"India","Pakistan","China"};
       
        for(int i=0;i<3;i++)
        {
           b.write(Country[i]);
           b.flush();
        }
   
     }
    
}

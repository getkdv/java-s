
package outputstream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Outputstream {

    
    public static void main(String[] args) throws IOException {
//        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Write a Sentence");
//            String s=b.readLine();
//            byte c[]=s.getBytes();
//            try(FileOutputStream fs=new FileOutputStream("E:\\karan java\\jdvc\\abc.txt"))
//            {
//                for(int i=0;i<c.length ;i++)
//                {
//                    fs.write(c[i]);
//                }
//            System.out.println("Done Successfully");
//            }
//                catch(Exception e)
//                {
//                    System.out.println(e);
//                }
//         FileReader fr=new FileReader("E:\\karan java\\jdvc\\abc.txt");
//        int i;
//       while((i=fr.read())!=-1)
//       {
//           System.out.print((char)i);
//       }
      Path p=Paths.get("E:\\karan java\\jdvc\\abc.txt");
      Path p1=Paths.get("C:\\Users\\student\\Desktop\\abc.txt");
      Files.copy(p, p1);
    }
}

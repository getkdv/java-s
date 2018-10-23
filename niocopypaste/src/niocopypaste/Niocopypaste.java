package niocopypaste;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Niocopypaste {

    public static void main(String[] args) throws IOException {
        
        Path p =Paths.get("E:\\karan java\\jdvc\\sample.txt");
        //Files.createDirectories(p);
        Path s=Paths.get("C:\\Users\\student\\Desktop\\sample.txt");
        //Files.createFile(s);
        //Files.copy(s,p);
        //Files.move(p,s);
        //Files.delete(s);   
        
    }   
    
}

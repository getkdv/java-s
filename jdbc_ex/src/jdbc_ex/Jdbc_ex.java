
package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_ex {

    public static void main(String[] args) throws Exception {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=karan", "sa", "faculty");
Statement s=c.createStatement();
s.addBatch("Insert into std_details(std_name,std_id,std_class) values ('nitesh',25,'fyco')");
s.addBatch("Insert into std_details(std_name,std_id,std_class) values ('raj',24,'tyco')");
s.addBatch("Insert into std_details(std_name,std_id,std_class) values ('rohit',26,'syco')");



int res[]=s.executeBatch();
for(int i=0; i<res.length ;i++){
    System.out.println(res[i]);
    
}
ResultSet r=s.executeQuery("select * from std_details");

        while(r.next())
            {
            System.out.println(r.getString(1)+""+r.getInt(2)+""+r.getString(3));
            }
    }
 }        
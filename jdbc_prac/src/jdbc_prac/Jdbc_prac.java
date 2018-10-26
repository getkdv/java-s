package jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdbc_prac {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=bank_emp", "sa", "faculty");
        Statement s= c.createStatement();
        ResultSet r=s.executeQuery("Select * from emp_details");
        while(r.next())
        {
            System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getString(3));
        }
        
        
    }
    
}

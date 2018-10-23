package tptptp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tptptp {

    public static void main(String[] args) throws Exception {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=stoore", "sa", "faculty");
    Statement s=c.createStatement();
//    String s1="Insert into g_store(g_name,g_price) VALUES (?,?)";
    String s1="Update g_store set g_price=10 where g_price = 20";
    
    PreparedStatement ps =c.prepareStatement(s1);
    
  //  ps.setInt(1,10);
    int ex=ps.executeUpdate();
    ResultSet r =s.executeQuery("Select * from g_store");
    while(r.next())
    {
        System.out.println(r.getString(1)+" "+r.getInt(2));
    }
    
    }
    
}

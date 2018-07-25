package com.org.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
 
public class DBConnection {
   
    
   
    public static Connection getDBConnectin() throws ClassNotFoundException,SQLException
    {
        ResourceBundle rb= ResourceBundle.getBundle("database");
            String drivername= rb.getString("drivername");
            Class.forName(drivername);
           String url= rb.getString("url");
           String user= rb.getString("user");
           String password= rb.getString("password");
           Connection con = DriverManager.getConnection(url,user,password);
           return con;
    }
   
     public static void closeDBConnecton(Connection con)throws SQLException
     {
         if(con!=null)
         {
               con.close();
            
            
            
         }
     }
 
}
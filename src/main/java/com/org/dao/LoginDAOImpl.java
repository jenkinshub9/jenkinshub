
 
package com.org.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.org.model.LoginVO;
import com.org.util.DBConnection;
 
public class LoginDAOImpl implements LoginDAO
{
   
    private static ResourceBundle rb= ResourceBundle.getBundle("database");
    private static Logger logger = LoggerFactory.getLogger(LoginDAOImpl.class);
   
    public boolean loginCheck(LoginVO  login  ) throws SQLException, ClassNotFoundException{
       
          boolean result=false;
           String query= rb.getString("LoginQuery");
           logger.info("LoginQuery:"+query);
            Connection con= DBConnection.getDBConnectin();
         try
         {
            PreparedStatement st= con.prepareStatement(query);
           
          ResultSet resultSet=  st.executeQuery();
         
          if(resultSet.next())
          {         
              result=true;
            logger.debug("result in login check of dao resultset check:"+result);
              System.out.println("login result:"+result);
          }
          logger.info("loginCheck in DAO result:"+result);
         }
         catch(SQLException e)
         {
            System.out.println("slqexception error:"+e);
         }
         finally
         {
          DBConnection.closeDBConnecton(con);
         }
            return result;
           
    }
 
    
}
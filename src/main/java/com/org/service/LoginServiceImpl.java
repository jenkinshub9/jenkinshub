package com.org.service;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import org.apache.maven.doxia.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import com.org.controller.LoginController;
import com.org.dao.LoginDAO;
import com.org.dao.LoginDAOImpl;
import com.org.model.LoginVO;
import com.org.model.PlayerVO;
 
 
public class LoginServiceImpl implements LoginService
{
 
    static LoginDAO  loginDAO;
    public static final Logger   LOG= LoggerFactory.getLogger(LoginServiceImpl.class);
   
    public static LoginDAO getLoginDAO( ) {
         LOG.info(" call to getLoginDAO in login service method");
        if(loginDAO==null)
        {
            LOG.debug("login dao is null true "+loginDAO);
            loginDAO = new LoginDAOImpl();
        }
        LOG.info("login dao in getLoginDAO() method :"+loginDAO);
        return loginDAO;
    }
 
    public boolean loginCheck(LoginVO login) throws SQLException, ClassNotFoundException {
        
        // validation code
        getLoginDAO( );
       
        LOG.info("After calling getLoginDAO() method:");
          boolean result  = loginDAO.loginCheck(login);
          LOG.info("result from loginCheck() dao in login service:"+result);
        return result;
    }
   
}
 
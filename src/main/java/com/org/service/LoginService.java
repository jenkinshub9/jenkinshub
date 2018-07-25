package com.org.service;
 
import java.sql.SQLException;
import java.util.List;
 
import com.org.model.LoginVO;
import com.org.model.PlayerVO;
 
 
 
public interface LoginService {
 
    boolean loginCheck(LoginVO login)throws SQLException , ClassNotFoundException;
}
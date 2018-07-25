package com.org.dao;
 
import java.sql.SQLException;
import java.util.List;
 
 
import com.org.model.PlayerVO;
 
 
 
public interface PlayerDAO {
 
    int savePlayer(PlayerVO  player)throws SQLException, ClassNotFoundException;
 
     List<PlayerVO> getAllPlayers()throws ClassNotFoundException,SQLException;
   
    List<PlayerVO> getBestBatsman()throws ClassNotFoundException,SQLException;
}
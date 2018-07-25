package com.org.service;
 
import java.sql.SQLException;
import java.util.List;
import com.org.model.PlayerVO;
 
 
 
public interface PlayerService {
 
int savePlayer(PlayerVO player)throws ClassNotFoundException, SQLException;
List<PlayerVO> getAllPlayers()throws ClassNotFoundException,SQLException;
List<PlayerVO>  getBestBatsman()throws ClassNotFoundException,SQLException;
}
 
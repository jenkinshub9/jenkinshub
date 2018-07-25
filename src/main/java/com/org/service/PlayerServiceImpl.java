package com.org.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.org.dao.PlayerDAO;
import com.org.dao.PlayerDAOImpl;
import com.org.model.PlayerVO;
 
 
public class PlayerServiceImpl implements PlayerService
{
 
    static PlayerDAO  playerDAO;
    public static PlayerDAO getCustomerDAO( ) {
        
        if(playerDAO==null)
        {
            playerDAO = new PlayerDAOImpl();
        }
        return playerDAO;
    }
 
    public int savePlayer(PlayerVO player)throws ClassNotFoundException, SQLException {
        playerDAO=getCustomerDAO();
           int maxpoints= 0;
          
           maxpoints= ((player.getNoOfCenturies())/100 * 5)+ ((player.getNoOfCenturies())/50 *2)+(player.getNoOfCatches()*3);
                  
            player.setNoOfPointsOwned(maxpoints);   
           
            int result=playerDAO.savePlayer(player);
             
        return result;
     }
 
    
    public List<PlayerVO> getAllPlayers()throws ClassNotFoundException,SQLException {
         List<PlayerVO> playerList= new ArrayList<PlayerVO>();
         playerDAO=getCustomerDAO();
 
            playerList=playerDAO.getAllPlayers();
        
        return playerList;
    }
    public List<PlayerVO>  getBestBatsman()throws ClassNotFoundException,SQLException
    {
         List<PlayerVO> playerList= new ArrayList<PlayerVO>();
         playerDAO=getCustomerDAO();
 
            playerList=playerDAO.getBestBatsman();
        
        return playerList;
    }
   
}
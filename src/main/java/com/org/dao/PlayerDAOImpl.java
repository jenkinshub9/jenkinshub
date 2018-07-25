package com.org.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.org.model.PlayerVO;
import com.org.util.DBConnection;
 
 
 
public class PlayerDAOImpl implements PlayerDAO
{
   
    private static ResourceBundle rb= ResourceBundle.getBundle("database");
    private static Logger logger = LoggerFactory.getLogger(PlayerDAOImpl.class);
   
    public int savePlayer(PlayerVO player) throws SQLException, ClassNotFoundException {
        
         String query= rb.getString("InsertQuery");
            logger.info("LoginQuery:"+query);
            Connection con= DBConnection.getDBConnectin();
            PreparedStatement st= con.prepareStatement(query);
            st.setString(1, player.getPlayerName());
            st.setString(2, player.getPlayertype());
            st.setInt(3, player.getNoOfCenturies());
            st.setInt(4, player.getNoOfHalfCenturies());
            st.setInt(5, player.getNoOfCatches());
            st.setString(6, player.getContactNumber());
            st.setInt(7,player.getNoOfPointsOwned());
            int result=  st.executeUpdate();
            System.out.println("insert result:"+result);
            return result;
           
    }
 
 
    public List<PlayerVO> getAllPlayers() throws ClassNotFoundException,SQLException{
       
            String query= rb.getString("SelectAllPalyer");
            logger.info("LoginQuery:"+query);
            Connection con= DBConnection.getDBConnectin();
           PreparedStatement st= con.prepareStatement(query);
             
           List<PlayerVO> playerList= new ArrayList<PlayerVO>();
             
          ResultSet result=  st.executeQuery();
        
                  while(result.next())
                  {
                     PlayerVO  player= new PlayerVO();
                     player.setPlayerId(result.getInt(1));
                     player.setPlayerName(result.getString(2));
                     player.setPlayertype(result.getString(3));
                     player.setNoOfCenturies(result.getInt(4));
                     player.setNoOfHalfCenturies(result.getInt(5));
                     player.setNoOfCatches(result.getInt(6));
                     player.setContactNumber(result.getString(7));
                     player.setDateOfRegistration(result.getDate(8));
                     player.setNoOfPointsOwned(result.getInt(9));
                     playerList.add(player);
                  }
         
            System.out.println("insert result:"+playerList);
   
                return playerList;
    }
    public List<PlayerVO>  getBestBatsman()throws ClassNotFoundException,SQLException
    {
       
        String query= rb.getString("SelectAllPalyer");
        logger.info("LoginQuery:"+query);
        Connection con= DBConnection.getDBConnectin();
       PreparedStatement st= con.prepareStatement(query);
             
           List<PlayerVO> playerList= new ArrayList<PlayerVO>();
             
          ResultSet result=  st.executeQuery();
                     int maxpoint=0;
                  while(result.next())
                  {
                     PlayerVO  player= new PlayerVO();
                     player.setPlayerId(result.getInt(1));
                     player.setPlayerName(result.getString(2));
                     player.setPlayertype(result.getString(3));
                     player.setNoOfCenturies(result.getInt(4));
                     player.setNoOfHalfCenturies(result.getInt(5));
                     player.setNoOfCatches(result.getInt(6));
                     player.setContactNumber(result.getString(7));
                     player.setDateOfRegistration(result.getDate(8));
                     player.setNoOfPointsOwned(result.getInt(9));
                   
                     if(maxpoint<player.getNoOfPointsOwned())
                     maxpoint=player.getNoOfPointsOwned();
                     playerList.add(player);
                  }
                  System.out.println("bset batsman maxpoint:"+maxpoint);
            List<PlayerVO> bestPlayerList= new ArrayList<PlayerVO>();
                     for(PlayerVO player : playerList)
                     {
                         if(player.getNoOfPointsOwned()==maxpoint)
                             bestPlayerList.add(player);
                        
                     }
                 
            System.out.println("best batsman result:"+bestPlayerList);
   
                return bestPlayerList;
    }
 
}
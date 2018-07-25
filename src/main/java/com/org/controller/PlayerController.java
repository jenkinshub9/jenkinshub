package com.org.controller;
 
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
 
import org.slf4j.Logger;
 
import org.slf4j.LoggerFactory;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;
 
import com.org.model.PlayerVO;
 
import com.org.service.PlayerService;
import com.org.service.PlayerServiceImpl;
 
/**
* Servlet implementation class LoginController
*/
public class PlayerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
     
        
        Logger logger = LoggerFactory.getLogger(PlayerController.class);
             
 
        // the following statement is used to log any messages 
        logger.info("My first log"); 
 
        logger.info("welcome  ");
        RequestDispatcher dispatch= request.getRequestDispatcher("/PlayerReport.jsp");
           String param=request.getParameter("param");
          
           List<PlayerVO>  playerList=null;
           PlayerService  playerService = new PlayerServiceImpl();
           try
           {
              
           if(param.equals("all"))
           {
              playerList= playerService.getAllPlayers();
              logger.info(playerList.toString());
              request.setAttribute("playerList",playerList );
              
           }
           else
           {
               playerList= playerService.getBestBatsman();
                  request.setAttribute("playerList",playerList );
                  System.out.println("lsit :"+playerList);
               System.out.println("in else part of do get");
           }
           }
               catch(SQLException e)
               {
                   System.out.println("sql exception :"+e);
                  
               }
               catch(ClassNotFoundException e)
               {
                   System.out.println("class not found:"+e);
               }
              
          
         
      dispatch.forward(request,response);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Logger logger = LoggerFactory.getLogger(PlayerController.class);
          PlayerService  s= new PlayerServiceImpl();
          PlayerVO  player = new PlayerVO();
         
          player.setPlayerName(request.getParameter("playername"));
          player.setPlayertype(request.getParameter("playertype"));
          int noOfCenturies =Integer.parseInt(request.getParameter("noofcenturies"));
          player.setNoOfCenturies(noOfCenturies);
          int  noOfHalfCenturies=Integer.parseInt( request.getParameter("noofhalfcenturies"));
          player.setNoOfHalfCenturies(noOfHalfCenturies);
          int noOfCatches =Integer.parseInt(request.getParameter("noofcatches"));
          player.setNoOfCatches(noOfCatches);
          player.setContactNumber(request.getParameter("contactnumber"));
         
          PlayerService  playerService= new PlayerServiceImpl();
          int result=0;
          try
          {
            result= playerService.savePlayer(player);
          }
          catch(SQLException e)
          {
              System.out.println("sql  exception"+e);
          }
          catch(ClassNotFoundException e1)
          {
              System.out.println("class not found exception"+e1);
          }
          logger.info("customer logging :"+player);
          System.out.println("customer is saved"+result);
          response.sendRedirect("MemberOptions.jsp");
        }
 
}
 
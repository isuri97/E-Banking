/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.util.*;
import java.sql.*;

/**
 *
 * @author isurianuradha
 */
public class Databaseconnection {

    Connection con;
    Statement st;
    ResultSet rs;
    
    /**
     * @param args the command line arguments
     */
    public Databaseconnection(){
        
        
        String url="jdbc:mysql://localhost/sys";                               // Setup Connection URL
        String userid="root";                                                   // Default username is root
        String password="root";                                                     // Default Password is empty string
        
        try
        {
                      
            
            Class.forName("com.mysql.jdbc.Driver");                             // Load Driver class
            
             con = DriverManager.getConnection(url,userid,password);  // Connect to Database using credentials
            
             st = con.createStatement();                             // Create statement
            
             System.out.println("connected");
            
        }
        catch(Exception e)
        {
           
        }   
    }
}
        
  

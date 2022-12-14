/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author INSIGHT
 */
public class databaseConnection {
    
    static Connection connection() throws SQLException
    {
        try{
        
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
             return con;
           
             
        
        }
        catch(Exception e)
        {
        
            System.out.println(e);
            return null;
        }
        
       
        
        
    }
    
}



         
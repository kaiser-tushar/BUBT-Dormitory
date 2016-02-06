
package Dormitory;

import java.sql.*;
import javax.swing.*;
public class connect {
    Connection con=null;
  public static Connection DB()
  {
    
      try{
       Class.forName("org.sqlite.JDBC");
      
      // Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Achievers\\Documents\\NetBeansProjects\\Login\\dormitory.sqlite");
       Connection con=DriverManager.getConnection("jdbc:sqlite:dormitory.sqlite");
     //  JOptionPane.showMessageDialog(null,"Connection Establish");
       return con;
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
  }  
}

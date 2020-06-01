/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANCY
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    
    public static Connection connecrDb(){
        try{
            String url= "jdbc:mysql://localhost:3306/librarymanagementsystem";
            String uname = "root";
            String pass = "123456";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,pass);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}

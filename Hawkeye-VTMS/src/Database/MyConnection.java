/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author 18764
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    //public static Connection getConnection(){
    public static void main(String[] args) {
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/logindb", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Admin");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println("----------------------");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        //return con;
    }
    
}    



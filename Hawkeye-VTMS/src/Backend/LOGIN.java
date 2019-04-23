/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.*;
import java.sql.*;
import Database.MyConnection;
/**
 *
 * @author 18764
 */
public class LOGIN {                              
        PreparedStatement ps;
        ResultSet rs;
    public LOGIN(String id, String pass){
        if(!("".equals(id))){
            String query = "SELECT * FROM `Admin` WHERE `id` =? AND `password` =?";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, pass);

                rs = ps.executeQuery();

                if(rs.next())
                {
                   
                }
            }catch(Exception e){
                    System.out.println(e);
                    }
           
        }
        else if(!("".equals(id))){
            String query = "SELECT * FROM `VehicleDepartmentRep` WHERE `id` =? AND `password` =?";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, pass);

                rs = ps.executeQuery();

                if(rs.next())
                {
                   
                }
            }catch(Exception e){
                    System.out.println(e);
                    }
           
        }
        else if(!("".equals(id))){
            String query = "SELECT * FROM `CustomerServiceRep` WHERE `id` =? AND `password` =?";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, pass);

                rs = ps.executeQuery();

                if(rs.next())
                {
                   
                }
            }catch(Exception e){
                    System.out.println(e);
                    }
           
        }    
        else{
            System.out.println("Incorrect Username Or Password");
        }
    }                                                
}

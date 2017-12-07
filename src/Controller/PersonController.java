/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joelandrew
 */
public class PersonController {
    
    ResultSet rs; 
    Connection conn = null;
    Statement stmt = null;
    
    
    public PersonController() {
        try {
            Database db = new Database();
            db.konekDatabase();
      //      stmt = db.konekDatabase().createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean loginMahasiswa(String username, String password) throws SQLException {
        String sql = "select * from person where username = '" + username + "' and password = '" + password + "'";
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
        return rs.next() ? true : false;
    }
    
}

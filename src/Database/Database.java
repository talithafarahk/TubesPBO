/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author joelandrew
 */
public class Database {
    
    private Connection conn = null;
    public static String NIM;
    private Statement s;
    private ResultSet rs=null;
    
    
    public void konekDatabase() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrasi_matkul", "root", "");
            System.out.println("Terkoneksi");
            s=conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        
        //return conn;
    }
    public ResultSet executeGet(String q){
        try{
            rs=s.executeQuery(q);
            return rs;
        }catch(Exception ex){
            ex.printStackTrace();
            return rs;
        }
    }
    public ResultSet executeInsert(String q){
        try{
            s.execute(q, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = s.getGeneratedKeys();
            return rs;
        }catch(Exception ex){
            ex.printStackTrace();
            return rs;
        }
    }
    public void disconect(){
        try{
            conn.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
}

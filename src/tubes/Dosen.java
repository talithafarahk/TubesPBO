/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import Database.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Talitha Farah
 */
public class Dosen extends Person {
    private String NIP;
    private String Jabatan;
    Statement stmt=null;
    Connection c=null;

    public Dosen(String NIP, String Jabatan, String nama, String jeniskelamin, int umur, String username, String password) {
        super(nama, jeniskelamin, umur,username, password);
        this.NIP = NIP;
        this.Jabatan = Jabatan;
    }

    public String getNIP() {
        return NIP;
    }

    public String getJabatan() {
        return Jabatan;
    }

    @Override
    public String getId() {
        return null;            
    }
    
    
    public ArrayList<Dosen> getListDosen(){
         try{
            ArrayList<Dosen> listDosen = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select NIP, jabatan, nama, jeniskelamin, umur, username, password from dosen";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                Dosen d = new Dosen(rs2.getString("NIP"),rs2.getString("jabatan"),rs2.getString("nama"), rs2.getString("jeniskelamin")
                        , rs2.getInt("umur"), rs2.getString("username"), rs2.getString("password"));
                listDosen.add(d);
            }
            DB.disconect();
            return listDosen;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    
    
    }
    public Dosen getDosen(String NIP){
         try{
            Dosen d = null;
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select NIP, jabatan, nama, jeniskelamin, umur, username, password from dosen where NIP ='"+NIP+"'";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                d = new Dosen(rs2.getString("NIP"),rs2.getString("jabatan"),rs2.getString("nama"), rs2.getString("jeniskelamin")
                        , rs2.getInt("umur"), rs2.getString("username"), rs2.getString("password"));
    
            }
            DB.disconect();
            return d;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    
    
    }
    
}

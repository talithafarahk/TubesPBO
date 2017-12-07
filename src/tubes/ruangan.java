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
public class ruangan {
    private String idRuangan;
    private int kapasitas;
    private int noRuangan;
    Statement stmt=null;
    Connection c=null;
   

    public ruangan(String idRuangan, int kapasitas, int noRuangan) {
        this.idRuangan = idRuangan;
        this.kapasitas = kapasitas;
        this.noRuangan = noRuangan;
    }

    public String getIdRuangan() {
        return idRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public int getNoRuangan() {
        return noRuangan;
    }
     public ArrayList<ruangan> getListRuangan(){
         try{
            ArrayList<ruangan> listruangan = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select iDRuangan, Kapasitas, NoRuangan from Ruangan";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                ruangan r = new ruangan(rs2.getString("idRuangan"),rs2.getInt("kapasitas"),rs2.getInt("noRuangan"));
                listruangan.add(r);
            }
            DB.disconect();
            return listruangan;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
}

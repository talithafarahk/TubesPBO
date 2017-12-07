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
public class kelas {
    private String idKelas;
    private int jmlhMahasiswa;
    private String jenis;
    Statement stmt=null;
    Connection c=null;

    public kelas(String idKelas, int jmlhMahasiswa, String jenis) {
        this.idKelas = idKelas;
        this.jmlhMahasiswa = jmlhMahasiswa;
        this.jenis = jenis;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public int getJmlhMahasiswa() {
        return jmlhMahasiswa;
    }

    public String getJenis() {
        return jenis;
    }
    
    public ArrayList<kelas> getListKelas(){
         try{
            ArrayList<kelas> listkelas = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select idKelas, jmlhMahasiswa, jenis from kelas";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                kelas k = new kelas(rs2.getString("idKelas"),rs2.getInt("jmlhMahasiswa"),rs2.getString("jenis"));
                listkelas.add(k);
            }
            DB.disconect();
            return listkelas;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    public kelas getKelas(String idKelas){
         try{
            kelas k = null;
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select idKelas, jmlhMahasiswa, jenis from kelas where idKelas='"+idKelas+"'";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
              k = new kelas(rs2.getString("idKelas"),rs2.getInt("jmlhMahasiswa"),rs2.getString("jenis"));
            }
            DB.disconect();
            return k;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
}
}

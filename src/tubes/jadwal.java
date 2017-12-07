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
public class jadwal {
    private String kodeJadwal;
    private String jammulai;
    private String jamselesai;
    private int durasi;
    Statement stmt=null;
    Connection c=null;

    public jadwal(String kodeJadwal, String jammulai, String jamselesai, int durasi) {
        this.kodeJadwal = kodeJadwal;
        this.jammulai = jammulai;
        this.jamselesai = jamselesai;
        this.durasi = durasi;
    }

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public String getJammulai() {
        return jammulai;
    }

    public String getJamselesai() {
        return jamselesai;
    }

    public int getDurasi() {
        return durasi;
    }
    public ArrayList<jadwal> getListJadwal(){
         try{
            ArrayList<jadwal> listjadwal = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select kodeJadwal, jammulai, jamselesai, durasi from jadwal";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                jadwal j = new jadwal(rs2.getString("kodeJadwal"),rs2.getString("jammulai"),rs2.getString("jamselesai"), rs2.getInt(durasi));
                listjadwal.add(j);
            }
            c.close();
            return listjadwal;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public jadwal getJadwal(String id){
         try{
            jadwal j=null;
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select kodeJadwal, jammulai, jamselesai, durasi from jadwal where KodeJadwal='"+id+"'";;
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                j = new jadwal(rs2.getString("kodeJadwal"),rs2.getString("jammulai"),rs2.getString("jamselesai"), rs2.getInt(durasi));
            }
            DB.disconect();
            return j;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
}

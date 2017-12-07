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
public class MataKuliah {
    private String kodeMatkul;
    private int totalsks;
    private String namaMatkul;
    private jadwal Jadwal;
    private Dosen dosen;
    Statement stmt=null;
    Connection c=null;
    

    public MataKuliah(String kodeMatkul, int totalsks, String namaMatkul, jadwal Jadwal, Dosen dosen) {
        this.kodeMatkul = kodeMatkul;
        this.totalsks = totalsks;
        this.namaMatkul = namaMatkul;
        this.Jadwal = Jadwal;
        this.dosen = dosen;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public int getTotalsks() {
        return totalsks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public jadwal getJadwal() {
        return Jadwal;
    }

    public Dosen getDosen() {
        return dosen;
    }
    
    public ArrayList<MataKuliah> getListMataKuliah(){
         try{
            ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select kodeMatkul, totalsks, namaMatkul, idJadwal, NIP from MataKuliah";
            ResultSet rs2 = DB.executeGet(q);
                MataKuliah mk = new MataKuliah(rs2.getString("kodeMatkul"),rs2.getInt("totalsks"),rs2.getString("namaMatkul")
                        ,Jadwal.getJadwal(rs2.getString("idJadwal")), dosen.getDosen(rs2.getString("NIP")));
                listMataKuliah.add(mk);
            
            DB.disconect();
            return listMataKuliah;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    
    }
    
    public MataKuliah getMatkul(String kodeMatkul){
         try{
            MataKuliah m = null;
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select kodeMatkul, totalsks, namaMatkul, idJadwal, NIP from MataKuliah where kodeMatkul = '"+kodeMatkul+"'";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                m = new MataKuliah (rs2.getString("kodeMatkul"),rs2.getInt("totalsks"),rs2.getString("namaMatkul"),Jadwal.getJadwal(rs2.getString("idJadwal")),dosen.getDosen(rs2.getString("NIP")));
                    
            }
            DB.disconect();
            return m;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    }
    
}

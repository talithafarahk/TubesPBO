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
public class MataKuliahController {
    
    ResultSet rs; 
    Connection conn = null;
    Statement stmt = null;
    
    
    public MataKuliahController() {
        try {
            Database db = new Database();
            db.konekDatabase();
      //      stmt = db.konekDatabase().createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getMataKuliah() throws SQLException {
        String sql = "select * "
                + "from matakuliah "
                + "join jadwal using (kodeJadwal) "
                + "join dosen using (NIP) "
                + "join ruangan on matakuliah.ruangan = ruangan.idRuangan "
                + "join person on dosen.person = person.id";
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    public void tambahMataKuliah(String nim, String kodeMatkul) {
        String sql = "insert into ";
    }
    
}

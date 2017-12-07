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
public class Registrasi {
    private String idRegistrasi;
    private String tglRegistrasi;
    private Mahasiswa mahasiswa;
    private kelas Kelas;
    private MataKuliah matakuliah;
    Statement stmt=null;
    Connection c=null;
    
    public Registrasi(String idRegistrasi, String tglRegistrasi, Mahasiswa mahasiswa, kelas Kelas, MataKuliah matakuliah) {
        this.idRegistrasi = idRegistrasi;
        this.tglRegistrasi = tglRegistrasi;
        this.mahasiswa = mahasiswa;
        this.Kelas = Kelas;
        this.matakuliah = matakuliah;
    }

    public String getIdRegistrasi() {
        return idRegistrasi;
    }

    public String getTglRegistrasi() {
        return tglRegistrasi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public kelas getKelas() {
        return Kelas;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }
    
    
    public ArrayList<Registrasi> getListRegistrasi(){
         try{
            ArrayList<Registrasi> listRegistrasi = new ArrayList<>();
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select idRegistrasi, tglRegistrasi, NIM, idKelas from Registrasi";
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                Registrasi r = new Registrasi(rs2.getString("idRegistrasi"),rs2.getString("tglRegistrasi")
                        , mahasiswa.getMahasiswa(rs2.getString("NIM")), Kelas.getKelas(rs2.getString("idKelas")), matakuliah.getMatkul(rs2.getString("kodeMatkul")));
                listRegistrasi.add(r);
            }
            DB.disconect();
            return listRegistrasi;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
     public void RegistrasiMatkul (Registrasi rm){
         Database DB= new Database();
         DB.konekDatabase();
         String query = "INSERT INTO Registrasi (idRegistrasi, tglRegistrasi, NIM, idKelas) "
                 +"VALUES ('"+rm.getIdRegistrasi()+"','"+ rm.getTglRegistrasi()
                 +"','"+rm.getMahasiswa().getNim()+"','"+rm.getKelas().getIdKelas()+"'";
         ResultSet rs = DB.executeInsert(query);
         DB.disconect();
         
    }
     
     public void cekMatkul (String NIM){
         
     }
}

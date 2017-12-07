/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import Database.Database;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Talitha Farah
 */
public class Mahasiswa extends Person{
    private String nim;
    private String jurusan;
    private String fakultas;
    private int sks;
    private Date tanggalLahir;
    private String alamat;
    private String email;
    private String NoHp;
    Statement stmt=null;
    Connection c=null;

    public Mahasiswa(String nim, String jurusan, String fakultas,int sks, String nama, String jeniskelamin, int umur, String username, String passwoard, Date tanggalLahir, String alamat, String email, String NoHp) {
        super(nama, jeniskelamin, umur,username, passwoard);
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.sks = sks;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.email = email;
        this.NoHp = NoHp;
    }
    public Mahasiswa (){
        
    }
    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHp() {
        return NoHp;
    }
    
    @Override
    public String getId() {
        return null;
    }
    
    public ArrayList<Mahasiswa> getListMahasiswa(){
         try{
            ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
            Database DB= new Database();
            String q = "select NIM, jurusan, fakultas, sks, nama, jeniskelamin, umur, username, password, tanggalLahir from Mahasiswa";
            stmt =DB.konekDatabase();
            ResultSet rs2 = stmt.executeQuery(q);
            while(rs2.next()){
                Mahasiswa m = new Mahasiswa (rs2.getString("NIM"),rs2.getString("jurusan"),rs2.getString("fakultas"),rs2.getInt("sks"), rs2.getString("nama"), rs2.getString("jeniskelamin")
                        , rs2.getInt("umur"), rs2.getString("username"), rs2.getString("password"), rs2.getDate("tanggalLahir"), rs2.getString("alamat"), rs2.getString("email"), rs2.getString("NoHp"));
                listMahasiswa.add(m);
            }
            c.close();
            return listMahasiswa;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    
    
    }
    public Mahasiswa getMahasiswa(String NIM){
         try{
            Mahasiswa m = null;
            Database DB= new Database();
            String q = "select NIM, jurusan, fakultas, sks, nama, jeniskelamin, umur, username, password from Mahasiswa where NIM = '"+NIM+"'";
            DB.konekDatabase();
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                m = new Mahasiswa (rs2.getString("NIM"),rs2.getString("jurusan"),rs2.getString("fakultas"),rs2.getInt("sks"), rs2.getString("nama"), rs2.getString("jeniskelamin")
                        , rs2.getInt("umur"), rs2.getString("username"), rs2.getString("password"), rs2.getDate("tanggalLahir"), rs2.getString("alamat"), rs2.getString("email"),rs2.getString("NoHp")); 
            }
            DB.disconect();
            return m;
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    
    }
    
    public void updateMahasiswa (Mahasiswa m) {
        try {
            Database db = new Database();
            db.konekDatabase();
            
            String query = "UPDATE Mahasiswa set nama='" + m.getNama() + "',tanggalLahir='"+ m.getTanggalLahir()
                    +"', alamat = '" + m.getAlamat() + "' , noHP  = '" + m.getNoHp() + "' "
                    + "WHERE NIM = " + "'" + m.getNim() + "'";
            
            ResultSet rs = db.executeInsert(query);
            c.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public boolean login(String username, String password){
         try{
            Mahasiswa m = null;
            Database DB= new Database();
            DB.konekDatabase();
            String q = "select username, password, NIM from Mahasiswa where (username = '"+username+"' AND password = "+password+"')" ;
            ResultSet rs2 = DB.executeGet(q);
            while(rs2.next()){
                System.out.println("a");
                Database.NIM = rs2.getString("NIM");
                m = new Mahasiswa (null,null,null,1,null, null, 1,
                        rs2.getString("username"), rs2.getString("password"),null, null, null, null); 
            }
            DB.disconect();
            if (m!= null){
                return true;
            }
            else return false;
  
            
        } catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    
    }
}

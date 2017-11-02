/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Talitha Farah
 */
public class Registrasi {
    private String idRegistrasi;
    private String tglRegistrasi;
    private Mahasiswa mahasiswa;
    private kelas Kelas;

    public Registrasi(String idRegistrasi, String tglRegistrasi, Mahasiswa mahasiswa, kelas Kelas) {
        this.idRegistrasi = idRegistrasi;
        this.tglRegistrasi = tglRegistrasi;
        this.mahasiswa = mahasiswa;
        this.Kelas = Kelas;
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
    
}

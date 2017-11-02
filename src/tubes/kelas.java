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
public class kelas {
    private String idKelas;
    private int jmlhMahasiswa;
    private String jenis;

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
    
}

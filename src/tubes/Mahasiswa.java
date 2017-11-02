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
public class Mahasiswa {
    private String nim;
    private String jurusan;
    private String fakultas;

    public Mahasiswa(String nim, String jurusan, String fakultas) {
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
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
    
    
    
}

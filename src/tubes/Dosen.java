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
public class Dosen {
    private String NIP;
    private String Jabatan;

    public Dosen(String NIP, String Jabatan) {
        this.NIP = NIP;
        this.Jabatan = Jabatan;
    }

    public String getNIP() {
        return NIP;
    }

    public String getJabatan() {
        return Jabatan;
    }
    
    
}

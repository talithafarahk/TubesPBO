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
public class Admin {
    private String nip;
    private String jabatan;

    public Admin(String nip, String jabatan) {
        this.nip = nip;
        this.jabatan = jabatan;
    }

    public String getNip() {
        return nip;
    }

    public String getJabatan() {
        return jabatan;
    }
    
    
}

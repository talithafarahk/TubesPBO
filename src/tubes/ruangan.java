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
public class ruangan {
    private String idRuangan;
    private int kapasitas;
    private int noRuangan;

    public ruangan(String idRuangan, int kapasitas, int noRuangan) {
        this.idRuangan = idRuangan;
        this.kapasitas = kapasitas;
        this.noRuangan = noRuangan;
    }

    public String getIdRuangan() {
        return idRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public int getNoRuangan() {
        return noRuangan;
    }
    
}

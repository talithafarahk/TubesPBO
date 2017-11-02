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
public class MataKuliah {
    private String kodeMatkul;
    private int totalsks;
    private String namaMatkul;
    private jadwal Jadwal;
    private Dosen dosen;

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
    
    
}

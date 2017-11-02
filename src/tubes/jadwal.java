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
public class jadwal {
    private String kodeJadwal;
    private String jammulai;
    private String jamselesai;
    private int durasi;

    public jadwal(String kodeJadwal, String jammulai, String jamselesai, int durasi) {
        this.kodeJadwal = kodeJadwal;
        this.jammulai = jammulai;
        this.jamselesai = jamselesai;
        this.durasi = durasi;
    }

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public String getJammulai() {
        return jammulai;
    }

    public String getJamselesai() {
        return jamselesai;
    }

    public int getDurasi() {
        return durasi;
    }
    
    
}

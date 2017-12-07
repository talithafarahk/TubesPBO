/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import static Database.Database.NIM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes.Mahasiswa;
import view.viewProfil;

/**
 *
 * @author Talitha Farah
 */
public class ViewProfil implements ActionListener{
    viewProfil view = new viewProfil();
    Mahasiswa m = null;
    
    
    public ViewProfil(){
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setActionListener(this);
        m=m.getMahasiswa(NIM);
        view.setjFakultas(m.getFakultas());
        view.setjJurusan(m.getJurusan());
        view.setjSKS(String.valueOf(m.getSks()));
        view.setTxNama(m.getNama());
        view.setTxEmail(m.getEmail());
        view.setTxNoHP(m.getNoHp());
        view.setTxNIM(m.getNim());
        view.setTxAlamat(m.getAlamat());
        view.setjTGL(m.getTanggalLahir().toString());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(view.getBtnBack())){
          view.setVisible(false);
          view.dispose();
          AwalController awal = new AwalController();
      }
    
    }
    
    
    
}

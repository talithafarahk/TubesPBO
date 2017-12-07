/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes.Mahasiswa;
import view.Editprofile;

/**
 *
 * @author Talitha Farah
 */
public class editProfil implements ActionListener{
    Editprofile edit = new Editprofile();
    Mahasiswa m = null;
    
  
    public editProfil (){
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);
        edit.setActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
      if (e.getSource().equals(edit.getJbSave())){
          m=new Mahasiswa(Database.NIM,"","", 0, edit.getTxNama(), "", 0, "","", 
                  new java.sql.Date(edit.getJxDate().getTime()), edit.getTxAlamat(), edit.getTxEmail(), edit.getTxNoHP());
          m.updateMahasiswa(m);
          edit.ShowMessage("Data Berhasil di Update");
          edit.setVisible(false);
          edit.dispose();
          AwalController awal = new AwalController();
      }
      else if (e.getSource().equals(edit.getJbCancel())){
          edit.setVisible(false);
          edit.dispose();
           AwalController awal = new AwalController();
      }
      }
    
    
}   

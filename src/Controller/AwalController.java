/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Awal;

/**
 *
 * @author Talitha Farah
 */
public class AwalController implements ActionListener {
    Awal a = new Awal();

    public AwalController() {
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(a.getjBedit())){
            a.setVisible(false);
            a.dispose();
            editProfil edit = new editProfil ();
          }
        else if(e.getSource().equals(a.getjBlist())){
            a.setVisible(false);
            a.dispose();
            ListMatkul list = new ListMatkul();
            }  
        else if (e.getSource().equals(a.getjBregis())){
            a.setVisible(false);
            a.dispose();
            RegistrasiController regis = new RegistrasiController();
        }
        else if (e.getSource().equals(a.getJbLogOut())){
            a.setVisible(false);
            a.dispose();
            LogInController login = new LogInController();
        }
        else if (e.getSource().equals(a.getjView())){
            a.setVisible(false);
            a.dispose();
            ViewProfil view = new ViewProfil();
        }
    }
    
    
}

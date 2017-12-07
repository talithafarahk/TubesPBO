/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes.Mahasiswa;
import view.Login;
import view.Login_gui;

/**
 *
 * @author Talitha Farah
 */

public class LogInController implements ActionListener {
    
    Mahasiswa m = new Mahasiswa();
    Login_gui l = new Login_gui();

    public LogInController() {
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(l.getBtnLogin())){
        System.out.println("login");
        if (m.login(l.getUsernameField(), l.getPasswordField())){
            l.setVisible(false);
            l.dispose();
            AwalController a = new AwalController();
          }
        else{
         l.ShowMessage("username / password salah");
        }       
    }
    
    }
    
}

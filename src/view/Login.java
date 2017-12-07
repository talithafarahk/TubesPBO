/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.PersonController;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Talitha Farah
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        this.setSize(480, 440);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screen Shot 2017-11-30 at 08.57.38.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 160, 40, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screen Shot 2017-11-30 at 09.05.44.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 10, 270, 90);
        getContentPane().add(usernameField);
        usernameField.setBounds(150, 160, 204, 30);
        getContentPane().add(passwordField);
        passwordField.setBounds(150, 200, 204, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 160, 70, 29);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(190, 160, 280, 140);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screen Shot 2017-11-30 at 09.47.12.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 210, 40, 16);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 210, 70, 20);

        BtnLogin.setText("LogIn");
        jPanel2.add(BtnLogin);
        BtnLogin.setBounds(350, 370, 73, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 480, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    
    
    public String getPasswordField() {
        return String.valueOf(passwordField.getPassword());
    }

    public String getUsernameField() {
        return usernameField.getText();
    }
    public void setActionListener(ActionListener a){
        BtnLogin.addActionListener(a);
    }
    
    public void ShowMessage(String m){
        JOptionPane.showMessageDialog(this, m);
    }
}

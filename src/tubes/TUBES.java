/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import Database.Database;
import view.Login;

/**
 *
 * @author Talitha Farah
 */
public class TUBES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database();
        db.konekDatabase();
        new Login().setVisible(true);
    }
    
}

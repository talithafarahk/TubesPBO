/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.List;

/**
 *
 * @author Talitha Farah
 */
public class ListMatkul implements ActionListener {
    List list = new List();

 //   public ListMatkul() {
 //       list.setVisible(true);
 //       list.setLocationRelativeTo(null);
   //     list.setActionListener(this);
        
        
      
 //       String c[]= {"Kode Mata Kuliah","Nama Matakuliah","dosen","Status"};
  //      String data[][] = new String[cekMatkul.size()][c.length];
 //       int i = 0;
   //     for(MataKuliah r: listMatkul){
  //          data[i][0] = r.getKodeMatkul();
   //         data[i][1] = r.getMatkul().getNamaMatkul();
    //        data[i][2] = r.getDosen().getNamaDosen();
    //        data[i][3] = ;
    //        i++;
   //     }
   //     list.setListMatkul(data, c);
//    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(list.getJbBack())){
           list.setVisible(false);
           list.dispose();
           AwalController awal = new AwalController();            
        }
        
    }
    
    
}

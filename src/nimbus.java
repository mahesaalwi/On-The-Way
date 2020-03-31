
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hesa
 */
public class nimbus {
    public static void main (String[]args){
          try {
            //Tambahkan code berikut pada method Main.....
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
 
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new tampilan_awal().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    }
    


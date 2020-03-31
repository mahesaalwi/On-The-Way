
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahes
 */
public class screen {
    public static void main(String[]args) throws Exception{
        
         //method main nimbus
     UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        
    tampilan_awal Splash = new tampilan_awal();
    Splash.setVisible(true);
    
    login Login = new login();
    
   
  
      
        
    
    try{
    
        
    for(int i=0; i <= 100; i++){
        Thread.sleep(40);
        Splash.loadingnum.setText(Integer.toString(i)+"%");
        Splash.loadingbar.setValue(i);
        
        if(i==100){
            Splash.setVisible(false);
            Login.setVisible(true);
            
            
            
        }
       
    }
}catch(Exception e){
    
}
    
    }
    
}

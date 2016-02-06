
package Dormitory;
import javax.swing.*;

public class Login {

   
    public static void main(String[] args) {
        try{
            
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
             //UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
              UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
               //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
              
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        frame1 s=new frame1();
        //s.setBackground(Color.red);
       s.setVisible(true);
       //s.setBackground(Color.yellow);
        // TODO code application logic here
    }
}

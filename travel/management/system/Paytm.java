package travel.management.system;

import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame {
    Paytm() {
        setBounds(500, 200, 800, 600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://paytm.com/rent-paytm");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        
        setVisible(true);
    }
    
   
    public static void main(String[] args) {
        new Paytm(); // Corrected from Payment to Paytm
    }
}

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    About() {
        // Set the window properties
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        // Create and style the "ABOUT" label
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(180, 10, 150, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(l1);
        
        // Text content for the "About" section
        String s = "About the Project\n\n"
                 + "The objective of the Travel and Tourism Management System project is to develop "
                 + "an efficient and user-friendly system that streamlines the entire process from "
                 + "booking to travel experience, providing seamless services for travelers while "
                 + "optimizing operations for businesses.\n\n"
                 + "This application helps in accessing and managing comprehensive information related "
                 + "to travel and tourism, including booking services, destination details, travel advisories, "
                 + "financial transactions, and customer preferences. It serves as a centralized platform for "
                 + "both travelers and businesses.\n\n"
                 + "Advantages of the Project:\n"
                 + "- Provides accurate information\n"
                 + "- Simplifies manual work\n"
                 + "- Minimizes document-related tasks\n"
                 + "- Provides up-to-date information\n"
                 + "- User-friendly environment with warning messages\n"
                 + "- Travel details can be easily accessed\n"
                 + "- Booking confirmation notifications";
        
        // Create a TextArea for displaying the text
        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);  // Make it non-editable
        area.setBounds(20, 70, 450, 300);
        add(area);
        
        // Back button
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        // Make the window visible
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        // Close the window when the back button is clicked
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
}

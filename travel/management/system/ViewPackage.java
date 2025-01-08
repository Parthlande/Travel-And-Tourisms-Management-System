// ai generated
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewPackage extends JFrame implements ActionListener {

    JButton back;

    public ViewPackage(String username) {
        setBounds(450, 200, 900, 450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(60, 10, 300, 30);
        add(text);

        // Left side labels and fields
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Package");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220, 90, 150, 25);
        add(labelpackage);
        
        JLabel lblnumber = new JLabel("Total Persons");
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220, 130, 150, 25);
        add(labelpersons);
        
        JLabel lblname = new JLabel("Id");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);
        JLabel labelid = new JLabel();
        labelid.setBounds(220, 170, 150, 25);
        add(labelid);

       
        JLabel lblGender = new JLabel("Number");
        lblGender.setBounds(30, 210, 150, 25);
        add(lblGender);
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 210, 150, 25);
        add(labelnumber);

        // Right side labels and fields
        JLabel lblcountry = new JLabel("Phone");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 250, 150, 25);
        add(labelphone);

        JLabel lbladdress =new JLabel ("Price");
        lbladdress.setBounds (30, 290, 150, 25);
        add (lbladdress);

        JLabel labelprice = new JLabel();
        labelprice.setBounds (220, 290, 150, 25);
        add (labelprice);


        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(13, 360, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(500,50,300,350);
        add(image);
        
        try {
            Conn conn = new Conn();
            String query = "select * from bookpackage where username = '" + username + "'";
            ResultSet rs = conn.s.executeQuery(query);
            if (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelpersons.setText(rs.getString("persons"));
                labelnumber.setText(rs.getString("number"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new ViewPackage("parthlande2");
    }
}



















/*package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewPackage extends JFrame implements ActionListener{
    JButton back ;
    
    ViewPackage (String username) {
     setBounds(450 , 200 , 900 , 450);
     getContentPane(). setBackground(Color.WHITE);
     setLayout(null);


     JLabel text = new JLabel("VIEW PACKAGE DETAILS");
text.setFont(new Font("Tahoma", Font. BOLD, 20)); 
text.setBounds (60, 0, 300, 30);
add(text);

JLabel iblusername= new JLabel("VIEW PACKAGE DETAILS");
iblusername.setBounds (60, 0, 300, 30);
add(iblusername);

JLabel ibluserid= new JLabel();
ibluserid.setBounds (60, 0, 300, 30);
add(ibluserid);

JLabel iblid= new JLabel("PACKAGE ");
iblid.setBounds (30, 90, 150, 25);
add(iblid);

JLabel labelpackage= new JLabel("");
labelpackage.setBounds (220, 130, 150, 25);
add(labelpackage);

JLabel iblnumber= new JLabel("Total Persons");
iblnumber.setBounds (220,130, 150, 25);
add(iblnumber);

JLabel labelpersons= new JLabel();
labelpersons.setBounds (220,130, 150, 25);
add(labelpersons);

JLabel iblname= new JLabel();
iblname.setBounds (30,170, 150, 25);
add(iblname);

JLabel labelid= new JLabel();
labelid.setBounds (220,130, 150, 25);
add(labelid);

JLabel iblgender= new JLabel();
iblgender.setBounds (30,210, 150, 25);
add(iblgender);

JLabel labelcountry= new JLabel("Phone");
labelcountry.setBounds (220,130, 150, 25);
add(labelcountry);

JLabel labelnumber= new JLabel();
labelnumber.setBounds (210,110, 150, 25);
add(labelnumber);

JLabel labelphone= new JLabel();
labelphone.setBounds (220,130, 150, 25);
add(labelphone);

JLabel ibladdress= new JLabel();
ibladdress.setBounds (30,290, 150, 25);
add(ibladdress);

JLabel labelprice= new JLabel();
labelprice.setBounds (220,130, 150, 25);
add(labelprice);

back = new JButton("Back");
back.setBackground (Color. BLACK);
back.setForeground (Color.WHITE);
back.setBounds (350, 360, 100, 25);
back.addActionListener(this);
add (back);

ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icons/bookDetails.jpg"));
Image i2 = i1.getImage().getScaledInstance (600, 200, Image. SCALE_DEFAULT);
ImageIcon i3= new ImageIcon (i2);
JLabel image = new JLabel (i3);
image.setBounds (20, 400, 600,200);
add(image);*/


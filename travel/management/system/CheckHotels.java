//ai generated
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable {

    Thread t1;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    JLabel[] label = new JLabel[10];

    JLabel caption;

    public void run() {
        String[] text = new String[]{"JW MARRIOT", "HOTEL RAIGAD", "LAKE RIVER HOTEL", "RAJGURU MOTEL", "PASHA HOTEL", "CONRAD HOTEL", "PUNA HOTEL", "LAKE VIEW HOTEL", "JIJAU HOTEL", "TASTE OF INDIA HOTEL"};

        try {
            while (true) {
                for (int i = 0; i < text.length; i++) {
                    final int index = i;
                    SwingUtilities.invokeLater(() -> {
                        caption.setText(text[index]);
                        label[index].setVisible(true);
                    });
                    Thread.sleep(2500);
                    SwingUtilities.invokeLater(() -> label[index].setVisible(false));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CheckHotels() {
        setBounds(500, 200, 800, 600);
        caption = new JLabel();
        caption.setBounds(50, 500, 1000, 70);
        caption.setFont(new Font("parthlande2", Font.PLAIN, 40));
        caption.setForeground(Color.WHITE);
        add(caption);

        ImageIcon[] image = new ImageIcon[10];
        for (int i = 0; i <=9; i++) {
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel" + (i + 1) + ".jpg"));
            Image temp = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            image[i] = new ImageIcon(temp);
            label[i] = new JLabel(image[i]);
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);
        }

        t1 = new Thread(this);
        t1.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckHotels();
    }
}

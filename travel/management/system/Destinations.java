// ai generated
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable {

    Thread t1;

    JLabel[] label = new JLabel[10];

    JLabel caption;

    public void run() {
        String[] text = new String[]{"Destination 1", "Destination 2", "Destination 3", "Destination 4", "Destination 5", "Destination 6", "Destination 7", "Destination 8", "Destination 9", "Destination 10"};

        try {
            while (true) {
                for (int i = 0; i < text.length; i++) {
                    final int index = i;
                    SwingUtilities.invokeLater(() -> {
                        label[index].setVisible(true);
                    });
                    Thread.sleep(2500);
                    SwingUtilities.invokeLater(() -> label[index].setVisible(false));
                }
                // Pause before restarting the loop
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Destinations() {
        try {
            setBounds(500, 200, 800, 600);
            caption = new JLabel();
            caption.setBounds(50, 500, 1000, 70);
            caption.setFont(new Font("parthlande2", Font.PLAIN, 40));
            caption.setForeground(Color.WHITE);
            add(caption);

            ImageIcon[] image = new ImageIcon[10];
            for (int i = 0; i < 9; i++) {
                String imagePath = "/icons/dest" + (i + 1) + ".jpg";
                java.net.URL imageURL = getClass().getResource(imagePath);
                if (imageURL != null) {
                    image[i] = new ImageIcon(imageURL);
                    Image temp = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                    image[i] = new ImageIcon(temp);
                    label[i] = new JLabel(image[i]);
                    label[i].setBounds(0, 0, 800, 600);
                    add(label[i]);
                } else {
                    System.err.println("Image not found: " + imagePath);
                }
            }

            t1 = new Thread(this);
            t1.start();

            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Destinations();
    }
}

package oauh.projekt.druhy.rocnik;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SQL Administrator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);


        JMenuBar mb = new JMenuBar();
        JButton b1 = new JButton("Display");
            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame displayFrame = new JFrame("Display Frame");
                    displayFrame.setSize(400, 400);
                    displayFrame.setVisible(true);
                }
            });

        JButton b2 = new JButton("Add");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame addFrame = new JFrame("Add Frame");
                addFrame.setSize(400, 400);
                addFrame.setVisible(true);
            }
        });

        mb.add(b1);
        mb.add(b2);

        JLabel la = new JLabel("Welcome to SQL Administrator", SwingConstants.CENTER);

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, la);

        frame.setVisible(true);
    }
}

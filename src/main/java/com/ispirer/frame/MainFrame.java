package com.ispirer.frame;

import com.ispirer.ElementInitializer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    private static MainFrame instance;

    private MainFrame() {
        this.setVisible(true);
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setTitle("Ispirer test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(null);

    }

    public static MainFrame getInstance() {
        if(instance == null) {
            instance = new MainFrame();
        }
        return instance;
    }

}

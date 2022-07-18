package com.ispirer.button;

import com.ispirer.frame.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupMessageButton {
    JButton button = new JButton();

    public PopupMessageButton() {
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pressed");
            }
        });
        button.setBounds(20, 70, 100, 30 );
        MainFrame.getInstance().add(button);
    }
}

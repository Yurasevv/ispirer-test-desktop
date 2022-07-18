package com.ispirer.label;

import com.ispirer.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class PopupMessageLabel {
    private JLabel label = new JLabel();

    public PopupMessageLabel() {
        label.setText("После нажатия на кнопку появится сообщение");
        label.setFont(new Font("Roboto", Font.PLAIN, 20));
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(20, 30,500, 200);
        MainFrame.getInstance().add(label);
    }

}

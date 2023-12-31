package com.onenightinn.model.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

public class MessageDialog extends JDialog implements ActionListener {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 5669384463178310650L;
    JButton okBtn = new JButton("OK");
    JLabel label = new JLabel();

    public MessageDialog(String title, String msg) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(title);
        label.setText(msg);
        jbInit();
        okBtn.addActionListener(this);
    }

    private void jbInit() {
        label.setBounds(new Rectangle(56, 15, 197, 40));
        okBtn.setBounds(new Rectangle(114, 70, 68, 23));
        this.getContentPane().add(label);
        this.getContentPane().add(okBtn);
        getContentPane().setLayout(null);
        setSize(300, 150);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == okBtn) {
            dispose();
        }
    }
}

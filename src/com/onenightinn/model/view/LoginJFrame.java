package com.onenightinn.model.view;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import java.awt.Container;
import java.io.Serial;

public class LoginJFrame extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final String PREFERRED_LOOK_AND_FEEL = null;

    public LoginJFrame() {
        initComponents();
    }

    private void initComponents() {
        Container contentPane = getContentPane();

        // Create a GroupLayout for the content pane
        GroupLayout layout = new GroupLayout(contentPane);

        // Set the GroupLayout as the layout manager for the content pane
        contentPane.setLayout(layout);

        setSize(320, 240);
    }

    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null)
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
                    + " on this platform:" + e.getMessage());
        }
    }
}

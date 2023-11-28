package com.onenightinn.model.view.mainjframe;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class MainJFrame extends javax.swing.JFrame {

    @Serial
    private static final long serialVersionUID = 3320197207777135961L;

    /**
     * Creates new form ItineraryJFrame
     */
    public MainJFrame() {
        initComponents();

        this.setSize(350, 300);
        this.setVisible(true);
    }

    private void initComponents() {

        jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);
        jFileMenu = new JMenu();
        JMenu jSampleMenu = new JMenu();
        jSampleMenuItem = new JMenuItem();
        jExitMenuItem = new JMenuItem();
        jPanel1 = new JPanel();
        jButtonGetAvailableRoom = new JButton();
        jButtonRegisterCustomer = new JButton();

        jMenuBar.setNextFocusableComponent(jFileMenu);
        jMenuBar.setOpaque(false);

        jFileMenu.setText("File");
        jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));

        jSampleMenu.setText("Sample JMenu");
        jSampleMenu.setFont(new Font("Comic Sans MS", 1, 11));

        jExitMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
        jExitMenuItem.setText("Exit");

        jSampleMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
        jSampleMenuItem.setText("Sample Menu Item");
        jSampleMenu.add(jSampleMenuItem);

        jFileMenu.add(jSampleMenu);
        jFileMenu.add(jExitMenuItem);

        jMenuBar.add(jFileMenu);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setFont(new Font("Comic Sans MS", 0, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(225, 225, 225));
        jPanel1.setFont(new Font("Comic Sans MS", 0, 11)); // NOI18N
        jPanel1.setLayout(null);


        jButtonGetAvailableRoom.setFont(new Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonGetAvailableRoom.setText("See Available Rooms");
        jPanel1.add(jButtonGetAvailableRoom);
        jButtonGetAvailableRoom.setBounds(20, 20, 150, 25);


        jButtonRegisterCustomer.setFont(new Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonRegisterCustomer.setText("Register Customer");
        jPanel1.add(jButtonRegisterCustomer);
        jButtonRegisterCustomer.setBounds(20, 65, 150, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0,0,400,600);

        pack();
    }
    /**
     * Functions that return the Swing Items
     */
    public javax.swing.JMenuItem getFileMenuItem()
    {
        return jSampleMenuItem;
    }

    public javax.swing.JMenuItem getExitMenuItem()
    {
        return jExitMenuItem;
    }

    public JButton getGetAvailableRoomButton()
    {
        return jButtonGetAvailableRoom;
    }

    public JButton getGetRegisterCustomerButton()
    {
        return jButtonRegisterCustomer;
    }

    private javax.swing.JButton jButtonGetAvailableRoom;
    private javax.swing.JButton jButtonRegisterCustomer;
    private javax.swing.JMenuItem jExitMenuItem;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuItem jSampleMenuItem;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
}

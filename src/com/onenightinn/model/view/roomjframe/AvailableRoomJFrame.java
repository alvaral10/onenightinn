package com.onenightinn.model.view.roomjframe;

import com.onenightinn.model.domain.AvailableRoom;
import com.onenightinn.model.view.registercustomerjframe.RegisterCustomerJFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvailableRoomJFrame extends JFrame {

    JDesktopPane theDesktop = new JDesktopPane();

    /** Creates new form Room RentalJFrame */
    public AvailableRoomJFrame() {
        super("Available Rooms");
        getContentPane().add(theDesktop);

        this.setSize(500, 500);
        this.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        JMenu customerMenu = new JMenu("Customer");
        JMenuItem createCustomerItem = new JMenuItem("Enter Customer");
        fileMenu.add(createCustomerItem);
        createCustomerItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegisterCustomerJFrame registerCustomerJFrame = new RegisterCustomerJFrame();
                registerCustomerJFrame.setVisible(true);
                theDesktop.add(registerCustomerJFrame);
            }
        });
        customerMenu.add(createCustomerItem);
        menuBar.add(customerMenu);

        JMenu rentalMenu = new JMenu("Rental");
        JMenuItem createRentalItem = new JMenuItem("Enter Rental");
        fileMenu.add(createRentalItem);
        createRentalItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AvailableRoomJFrame availableRoomJFrame = new AvailableRoomJFrame();
                availableRoomJFrame.setVisible(true);
                theDesktop.add(availableRoomJFrame);
            }
        });
        rentalMenu.add(createRentalItem);
        menuBar.add(rentalMenu);

    }

    public static AvailableRoom getSelectedData() {
        return null;
    }

    /**
     * Initial components for the GUI
     */
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        setJMenuBar(jMenuBar);
        jFileMenu = new javax.swing.JMenu();
        jDataMenu = new javax.swing.JMenu();
        jFileMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelRate = new javax.swing.JLabel();
        jTextFieldRate = new javax.swing.JTextField();
        jLabelRentalType = new javax.swing.JLabel();
        jTextFieldRentalType = new javax.swing.JTextField();
        jButtonAvailableRoom = new javax.swing.JButton();

        jMenuBar.setOpaque(false);

        jFileMenu.setText("File");
        jFileMenu.setFont(new java.awt.Font("Times New Roman", 1, 11));

        jDataMenu.setText("Data");
        jDataMenu.setFont(new java.awt.Font("Times New Roman", 1, 11));

        jFileMenuItem.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jFileMenuItem.setText("Open From File...");
        jDataMenu.add(jFileMenuItem);

        jFileMenu.add(jDataMenu);

        jMenuBar.add(jFileMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Available Rooms");
        setFont(new java.awt.Font("Times New Roman", 0, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jPanel1.setLayout(null);

        jButtonAvailableRoom.setFont(new java.awt.Font("Times New Roman", 1, 15));
        jButtonAvailableRoom.setLabel("Enter");
        jButtonAvailableRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableRoomActionPerformed(evt);
            }

        });
        jPanel1.add(jButtonAvailableRoom);
        jButtonAvailableRoom.setBounds(20, 200, 150, 25);

        jLabelRate.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelRate.setText("Rate:");
        jPanel1.add(jLabelRate);
        jLabelRate.setBounds(76, 10, 70, 17);

        jLabelRentalType.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelRentalType.setText("Rental Type:");
        jPanel1.add(jLabelRentalType);
        jLabelRentalType.setBounds(35, 30, 100, 17);


        jTextFieldRate.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldRate.setText("$100");
        jPanel1.add(jTextFieldRate);
        jTextFieldRate.setBounds(130, 10, 90, 22);

        jTextFieldRentalType.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldRentalType.setText("Ski");
        jPanel1.add(jTextFieldRentalType);
        jTextFieldRentalType.setBounds(130, 30, 90, 22);


        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAvailableRoomActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGetAvailableRentalsActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonGetAvailableRentalsActionPerformed

    /**
     * Returns jFileMenuItem
     */
    public javax.swing.JMenuItem getFileMenuItem() {
        return jFileMenuItem;
    }

    /**
     * Returns jDatabaseMenuItem
     */

    /**
     * Returns jButtonGetAvailableRentals
     */
    public javax.swing.JButton getAvailableRoomButton() {
        return jButtonAvailableRoom;
    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AvailableRoomJFrame availableRoomJFrame = new AvailableRoomJFrame();
                //AvailableRoomJFrame.setSize(350,300);

                //AvailableRoomJFrame.setVisible(true);

                new AvailableRoomJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvailableRoom;
    private javax.swing.JMenu jDataMenu;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuItem jFileMenuItem;
    private javax.swing.JLabel jLabelRate;
    private javax.swing.JLabel jLabelRentalType;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldRate;
    private javax.swing.JTextField jTextFieldRentalType;
    // End of variables declaration//GEN-END:variables
}

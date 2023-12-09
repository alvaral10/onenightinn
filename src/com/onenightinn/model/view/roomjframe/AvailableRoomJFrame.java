package com.onenightinn.model.view.roomjframe;

import com.onenightinn.model.domain.AvailableRoom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.ArrayList;

public class AvailableRoomJFrame extends JFrame {

    @Serial
    private static final long serialVersionUID = 3320197207777135961L;

    JDesktopPane theDesktop = new JDesktopPane();

    /** Creates new form Room RentalJFrame */
    public AvailableRoomJFrame() {
        super("Available Rooms");
        getContentPane().add(theDesktop);

        initComponents();

        this.setSize(300, 250);
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

    }

    public AvailableRoom getSelectedData() {

        AvailableRoom availableRoom = new AvailableRoom<>(

                jTextFieldRate.getText(),
                jTextFieldRentalType.getText());

        return availableRoom;
    }

    /**
     * Initial components for the GUI
     */
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        setJMenuBar(jMenuBar);
        jFileMenu = new javax.swing.JMenu();
        jFileMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelRate = new javax.swing.JLabel();
        jTextFieldRate = new javax.swing.JTextField();
        jLabelRentalType = new javax.swing.JLabel();
        jTextFieldRentalType = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        ArrayList<String> availableRoomList = new ArrayList<>();
        availableRoomList.add("Hilton, King, $250");
        availableRoomList.add("Homewood Suites, King, $250");
        availableRoomList.add("Hampton Inn, King, $250");
        availableRoomList.add("Hilton, Queen, $150");
        availableRoomList.add("Homewood Suites, King, $150");
        availableRoomList.add("Hampton Inn, Queen, $150");

        jRoomComboBox = new JComboBox<>(availableRoomList.toArray(new String[0]));

        jMenuBar.setOpaque(false);

        jFileMenu.setText("File");
        jFileMenu.setFont(new java.awt.Font("Times New Roman", 1, 11));

        jMenuBar.add(jFileMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Available Rooms");
        setFont(new java.awt.Font("Times New Roman", 0, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(233, 233, 246));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jPanel1.setLayout(null);

        jLabelRate.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelRate.setText("Rate:");
        jPanel1.add(jLabelRate);
        jLabelRate.setBounds(76, 10, 70, 17);

        jTextFieldRate.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldRate.setText("$150");
        jPanel1.add(jTextFieldRate);
        jTextFieldRate.setBounds(130, 10, 90, 22);

        jLabelRentalType.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelRentalType.setText("Room Availability:");
        jPanel1.add(jLabelRentalType);
        jLabelRentalType.setBounds(30, 30, 100, 17);

        jTextFieldRentalType.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldRentalType.setText("Available");
        jPanel1.add(jTextFieldRentalType);
        jTextFieldRentalType.setBounds(130, 30, 90, 22);

        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonCancel.setText("Cancel");
        jPanel1.add(jButtonCancel);
        jButtonCancel.setBounds(150, 125, 80, 25);

        jButtonOk.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonOk.setText("Ok");
        jPanel1.add(jButtonOk);
        jButtonOk.setBounds(60, 125, 80, 25);

        jPanel1.add(jRoomComboBox);
        jRoomComboBox.setBounds(65,75,175,25);


        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * Returns jFileMenuItem
     */
    public javax.swing.JMenuItem getFileMenuItem() {
        return jFileMenuItem;
    }

    public javax.swing.JButton getOkButton()
    {
        return jButtonOk;
    }

    public javax.swing.JButton getCancelButton()
    {
        return jButtonCancel;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AvailableRoomJFrame availableRoomJFrame = new AvailableRoomJFrame();

                //itineraryJFrame.setSize(350,300);
                //itineraryJFrame.setVisible(true);
                //new ItineraryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuItem jFileMenuItem;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelRate;
    private javax.swing.JLabel jLabelRentalType;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldRate;
    private javax.swing.JTextField jTextFieldRentalType;
    private javax.swing.JComboBox<String> jRoomComboBox;
    // End of variables declaration//GEN-END:variables
}

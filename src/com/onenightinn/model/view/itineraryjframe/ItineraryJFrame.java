package com.onenightinn.model.view.itineraryjframe;

import com.onenightinn.model.domain.Itinerary;
import com.onenightinn.model.view.mainjframe.MainJFrame;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class ItineraryJFrame extends javax.swing.JFrame {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final String PREFERRED_LOOK_AND_FEEL = null;

    public ItineraryJFrame(){
        initComponents();

        this.setSize(350, 300);
        this.setVisible(true);

    }

    private void initComponents() {

        jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);
        jFileMenu = new JMenu();
        jFileMenuItem = new JMenuItem();
        jPanel1 = new JPanel();
        jExitMenuItem = new JMenuItem();
        jButtonGetAvailableRoom = new JButton();
        jButtonRegisterCustomer = new JButton();

        jTextFieldDestinationCity = new JTextField();
        jLabelDestinationCity = new JLabel();
        jTextFieldCheckinDateDay = new JTextField();
        jLabelCheckinDateDay = new JLabel();
        jTextFieldCheckinDateMonth = new JTextField();
        jLabelCheckinDateMonth = new JLabel();
        jTextFieldCheckinDateDay = new JTextField();
        jLabelCheckinDateYear = new JLabel();
        jTextFieldCheckinDateYear = new JTextField();
        jLabelCheckoutDateMonth = new JLabel();
        jTextFieldCheckoutDateMonth = new JTextField();
        jLabelCheckoutDateDay = new JLabel();
        jTextFieldCheckoutDateDay = new JTextField();
        jLabelCheckoutDateYear = new JLabel();
        jTextFieldCheckoutDateYear = new JTextField();
        jLabelCheckinDateTime = new JLabel();
        jTextFieldCheckinDateTime = new JTextField();
        jLabelCheckoutDateTime = new JLabel();
        jTextFieldCheckoutDateTime = new JTextField();

        jMenuBar.setNextFocusableComponent(jFileMenu);
        jMenuBar.setOpaque(false);

        jFileMenu.setText("File");
        jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));

        jFileMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
        jFileMenuItem.setText("Open From File...");

        jExitMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
        jExitMenuItem.setText("Exit");


        jFileMenu.add(jExitMenuItem);

        jMenuBar.add(jFileMenu);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setFont(new Font("Comic Sans MS", 0, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(153, 153, 255));
        jPanel1.setFont(new Font("Comic Sans MS", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabelDestinationCity.setFont(new Font("Comic Sans MS", 1, 11));
        jLabelDestinationCity.setText("PickUp City:");
        jPanel1.add(jLabelDestinationCity);
        jLabelDestinationCity.setBounds(47, 10, 70, 17);

        jTextFieldDestinationCity.setFont(new Font("Comic Sans MS", 0, 11));
        jTextFieldDestinationCity.setText("San Francisco");
        jPanel1.add(jTextFieldDestinationCity);
        jTextFieldDestinationCity.setBounds(130, 10, 90, 22);

        jButtonGetAvailableRoom.setFont(new Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonGetAvailableRoom.setLabel("See Available Rooms");

        jPanel1.add(jButtonGetAvailableRoom);
        jButtonGetAvailableRoom.setBounds(20, 200, 150, 25);

        jTextFieldCheckinDateMonth.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckinDateMonth.setText("12");
        jPanel1.add(jTextFieldCheckinDateMonth);
        jTextFieldCheckinDateMonth.setBounds(150, 60, 20, 20);

        jLabelCheckinDateMonth.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckinDateMonth.setText("MM:");
        jPanel1.add(jLabelCheckinDateMonth);
        jLabelCheckinDateMonth.setBounds(110, 60, 30, 17);

        jLabelCheckinDateDay.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckinDateDay.setText("DD:");
        jPanel1.add(jLabelCheckinDateDay);
        jLabelCheckinDateDay.setBounds(180, 60, 30, 17);

        jTextFieldCheckinDateDay.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckinDateDay.setText("08");
        jPanel1.add(jTextFieldCheckinDateDay);
        jTextFieldCheckinDateDay.setBounds(210, 60, 20, 20);

        jLabelCheckinDateYear.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckinDateYear.setText("YYYY: ");
        jPanel1.add(jLabelCheckinDateYear);
        jLabelCheckinDateYear.setBounds(250, 60, 40, 17);

        jTextFieldCheckinDateYear.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckinDateYear.setText("2023");
        jPanel1.add(jTextFieldCheckinDateYear);
        jTextFieldCheckinDateYear.setBounds(290, 60, 50, 20);

        jLabelCheckoutDateMonth.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckoutDateMonth.setText("MM:");
        jPanel1.add(jLabelCheckoutDateMonth);
        jLabelCheckoutDateMonth.setBounds(110, 90, 30, 17);

        jTextFieldCheckoutDateMonth.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckoutDateMonth.setText("12");
        jPanel1.add(jTextFieldCheckoutDateMonth);
        jTextFieldCheckoutDateMonth.setBounds(150, 90, 20, 20);

        jLabelCheckoutDateDay.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckoutDateDay.setText("DD:");
        jPanel1.add(jLabelCheckoutDateDay);
        jLabelCheckoutDateDay.setBounds(180, 90, 30, 17);

        jTextFieldCheckoutDateDay.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckoutDateDay.setText("03");
        jPanel1.add(jTextFieldCheckoutDateDay);
        jTextFieldCheckoutDateDay.setBounds(210, 90, 20, 20);

        jLabelCheckoutDateYear.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckoutDateYear.setText("YYYY: ");
        jPanel1.add(jLabelCheckoutDateYear);
        jLabelCheckoutDateYear.setBounds(250, 90, 40, 17);

        jTextFieldCheckoutDateYear.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckoutDateYear.setText("2023");
        jPanel1.add(jTextFieldCheckoutDateYear);
        jTextFieldCheckoutDateYear.setBounds(290, 90, 50, 20);

        jLabelCheckinDateTime.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckinDateTime.setText("Time:");
        jPanel1.add(jLabelCheckinDateTime);
        jLabelCheckinDateTime.setBounds(350, 60, 40, 17);

        jTextFieldCheckinDateTime.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckinDateTime.setText("12:00");
        jPanel1.add(jTextFieldCheckinDateTime);
        jTextFieldCheckinDateTime.setBounds(390, 60, 50, 20);

        jLabelCheckoutDateTime.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
        jLabelCheckoutDateTime.setText("Time:");
        jPanel1.add(jLabelCheckoutDateTime);
        jLabelCheckoutDateTime.setBounds(350, 90, 40, 17);

        jTextFieldCheckoutDateTime.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jTextFieldCheckoutDateTime.setText("1:00");
        jPanel1.add(jTextFieldCheckoutDateTime);
        jTextFieldCheckoutDateTime.setBounds(390, 90, 50, 20);


        jButtonRegisterCustomer.setFont(new Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonRegisterCustomer.setText("Register Customer");
        jPanel1.add(jButtonRegisterCustomer);
        jButtonRegisterCustomer.setBounds(20, 65, 150, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 300);

        pack();
    }

    public javax.swing.JMenuItem getFileMenuItem()
    {
        return jFileMenuItem;
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

    public Itinerary getSelectedData()
    {

        Itinerary itinerary = new Itinerary (
                jTextFieldDestinationCity.getText(),
                jTextFieldCheckinDateMonth.getText(),
                jTextFieldCheckinDateDay.getText(),
                jTextFieldCheckinDateYear.getText(),
                jTextFieldCheckinDateTime.getText(),
                jTextFieldCheckoutDateMonth.getText(),
                jTextFieldCheckoutDateDay.getText(),
                jTextFieldCheckoutDateYear.getText(),
                jTextFieldCheckoutDateTime.getText()
        );
        return itinerary;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame itineraryJFrame = new MainJFrame();
                itineraryJFrame.setSize(350,300);

                itineraryJFrame.setVisible(true);

                new ItineraryJFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonGetAvailableRoom;
    private javax.swing.JButton jButtonRegisterCustomer;
    private javax.swing.JMenuItem jExitMenuItem;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuItem jFileMenuItem;
    private javax.swing.JLabel jLabelCheckoutDateDay;
    private javax.swing.JLabel jLabelCheckoutDateMonth;
    private javax.swing.JLabel jLabelCheckoutDateTime;
    private javax.swing.JLabel jLabelCheckoutDateYear;
    private javax.swing.JLabel jLabelDestinationCity;
    private javax.swing.JLabel jLabelCheckinDateDay;
    private javax.swing.JLabel jLabelCheckinDateMonth;
    private javax.swing.JLabel jLabelCheckinDateTime;
    private javax.swing.JLabel jLabelCheckinDateYear;

    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDestinationCity;
    private javax.swing.JTextField jTextFieldCheckinDateMonth;
    private javax.swing.JTextField jTextFieldCheckinDateDay;
    private javax.swing.JTextField jTextFieldCheckinDateYear;
    private javax.swing.JTextField jTextFieldCheckinDateTime;
    private javax.swing.JTextField jTextFieldCheckoutDateMonth;
    private javax.swing.JTextField jTextFieldCheckoutDateDay;
    private javax.swing.JTextField jTextFieldCheckoutDateYear;
    private javax.swing.JTextField jTextFieldCheckoutDateTime;
}


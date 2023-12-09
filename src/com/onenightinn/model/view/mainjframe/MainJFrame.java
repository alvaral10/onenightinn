package com.onenightinn.model.view.mainjframe;

import com.onenightinn.model.domain.Itinerary;
import com.onenightinn.model.view.itineraryjframe.ItineraryJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.Serial;

public class MainJFrame extends javax.swing.JFrame {

    @Serial
    private static final long serialVersionUID = 3320197207777135961L;

    /**
     * Creates new form ItineraryJFrame
     */
    public MainJFrame() {
        initComponents();

        this.setSize(460, 275);
        this.setVisible(true);
    }

    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        setJMenuBar(jMenuBar);
        jFileMenu = new javax.swing.JMenu();
        jFileMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jExitMenuItem = new javax.swing.JMenuItem();
        jButtonGetAvailableRoom = new javax.swing.JButton();
        jButtonRegisterCustomer = new javax.swing.JButton();

        jTextFieldDestinationCity = new javax.swing.JTextField();
        jLabelDestinationCity = new javax.swing.JLabel();
        jLabelCheckinDate = new javax.swing.JLabel();
        jLabelCheckinDateDay = new javax.swing.JLabel();
        jTextFieldCheckinDateMonth = new javax.swing.JTextField();
        jLabelCheckinDateMonth = new javax.swing.JLabel();
        jTextFieldCheckinDateDay = new javax.swing.JTextField();
        jLabelCheckinDateYear = new javax.swing.JLabel();
        jTextFieldCheckinDateYear = new javax.swing.JTextField();
        jLabelCheckoutDateMonth = new javax.swing.JLabel();
        jTextFieldCheckoutDateMonth = new javax.swing.JTextField();
        jLabelCheckoutDate = new javax.swing.JLabel();
        jLabelCheckoutDateDay = new javax.swing.JLabel();
        jTextFieldCheckoutDateDay = new javax.swing.JTextField();
        jLabelCheckoutDateYear = new javax.swing.JLabel();
        jTextFieldCheckoutDateYear = new javax.swing.JTextField();
        jLabelCheckinDateTime = new javax.swing.JLabel();
        jTextFieldCheckinDateTime = new javax.swing.JTextField();
        jLabelCheckoutDateTime = new javax.swing.JLabel();
        jTextFieldCheckoutDateTime = new javax.swing.JTextField();

        jLabelHotel = new javax.swing.JLabel();
        jTextFieldHotel = new javax.swing.JTextField();
        jLabelModel = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabelRate = new javax.swing.JLabel();
        jTextFieldRate = new javax.swing.JTextField();

        jMenuBar.setNextFocusableComponent(jFileMenu);
        jMenuBar.setOpaque(false);

        jFileMenu.setText("File");
        jFileMenu.setFont(new Font("Times New Roman", 1, 11));

        jFileMenuItem.setFont(new Font("Times New Roman", 1, 11));
        jFileMenuItem.setText("Open From File...");

        jExitMenuItem.setFont(new Font("Times New Roman", 1, 11));
        jExitMenuItem.setText("Exit");


        jFileMenu.add(jExitMenuItem);

        jMenuBar.add(jFileMenu);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setFont(new Font("Times New Roman", 1, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(204, 153, 204));
        jPanel1.setFont(new Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabelDestinationCity.setFont(new Font("Times New Roman", 1, 11));
        jLabelDestinationCity.setText("Destination City:");
        jPanel1.add(jLabelDestinationCity);
        jLabelDestinationCity.setBounds(105, 18, 120, 17);

        jTextFieldDestinationCity.setFont(new Font("Times New Roman", 0, 11));
        jTextFieldDestinationCity.setText("Hartford");
        jPanel1.add(jTextFieldDestinationCity);
        jTextFieldDestinationCity.setBounds(200, 15, 90, 22);

        jLabelCheckinDate.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckinDate.setText("Check-In Date:");
        jPanel1.add(jLabelCheckinDate);
        jLabelCheckinDate.setBounds(20, 60, 80, 17);

        jTextFieldCheckinDateMonth.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckinDateMonth.setText("12");
        jPanel1.add(jTextFieldCheckinDateMonth);
        jTextFieldCheckinDateMonth.setBounds(135, 60, 20, 20);

        jLabelCheckinDateMonth.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckinDateMonth.setText("MM:");
        jPanel1.add(jLabelCheckinDateMonth);
        jLabelCheckinDateMonth.setBounds(110, 60, 30, 17);

        jLabelCheckinDateDay.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckinDateDay.setText("DD:");
        jPanel1.add(jLabelCheckinDateDay);
        jLabelCheckinDateDay.setBounds(175, 60, 30, 17);

        jTextFieldCheckinDateDay.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckinDateDay.setText("08");
        jPanel1.add(jTextFieldCheckinDateDay);
        jTextFieldCheckinDateDay.setBounds(195, 60, 20, 20);

        jLabelCheckinDateYear.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckinDateYear.setText("YYYY: ");
        jPanel1.add(jLabelCheckinDateYear);
        jLabelCheckinDateYear.setBounds(235, 60, 40, 17);

        jTextFieldCheckinDateYear.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckinDateYear.setText("2023");
        jPanel1.add(jTextFieldCheckinDateYear);
        jTextFieldCheckinDateYear.setBounds(270, 60, 50, 20);

        jLabelCheckoutDate.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckoutDate.setText("Check-Out Date:");
        jPanel1.add(jLabelCheckoutDate);
        jLabelCheckoutDate.setBounds(10, 90, 90, 17);

        jLabelCheckoutDateMonth.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckoutDateMonth.setText("MM:");
        jPanel1.add(jLabelCheckoutDateMonth);
        jLabelCheckoutDateMonth.setBounds(110, 90, 30, 17);

        jTextFieldCheckoutDateMonth.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckoutDateMonth.setText("12");
        jPanel1.add(jTextFieldCheckoutDateMonth);
        jTextFieldCheckoutDateMonth.setBounds(135, 90, 20, 20);

        jLabelCheckoutDateDay.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckoutDateDay.setText("DD:");
        jPanel1.add(jLabelCheckoutDateDay);
        jLabelCheckoutDateDay.setBounds(175, 90, 30, 17);

        jTextFieldCheckoutDateDay.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckoutDateDay.setText("03");
        jPanel1.add(jTextFieldCheckoutDateDay);
        jTextFieldCheckoutDateDay.setBounds(195, 90, 20, 20);

        jLabelCheckoutDateYear.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckoutDateYear.setText("YYYY: ");
        jPanel1.add(jLabelCheckoutDateYear);
        jLabelCheckoutDateYear.setBounds(235, 90, 40, 17);

        jTextFieldCheckoutDateYear.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckoutDateYear.setText("2023");
        jPanel1.add(jTextFieldCheckoutDateYear);
        jTextFieldCheckoutDateYear.setBounds(270, 90, 50, 20);

        jLabelCheckinDateTime.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckinDateTime.setText("Time:");
        jPanel1.add(jLabelCheckinDateTime);
        jLabelCheckinDateTime.setBounds(330, 60, 40, 17);

        jTextFieldCheckinDateTime.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckinDateTime.setText("12:00");
        jPanel1.add(jTextFieldCheckinDateTime);
        jTextFieldCheckinDateTime.setBounds(360, 60, 50, 20);

        jLabelCheckoutDateTime.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelCheckoutDateTime.setText("Time:");
        jPanel1.add(jLabelCheckoutDateTime);
        jLabelCheckoutDateTime.setBounds(330, 90, 40, 17);

        jTextFieldCheckoutDateTime.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldCheckoutDateTime.setText("1:00");
        jPanel1.add(jTextFieldCheckoutDateTime);
        jTextFieldCheckoutDateTime.setBounds(360, 90, 50, 20);

        jLabelHotel.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelHotel.setText("Hotel:");
        jPanel1.add(jLabelHotel);
        jLabelHotel.setBounds(68, 115, 90, 17);

        jTextFieldHotel.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldHotel.setText("Hilton");
        jPanel1.add(jTextFieldHotel);
        jTextFieldHotel.setBounds(110, 115, 50, 17);

        jLabelModel.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelModel.setText("Model:");
        jPanel1.add(jLabelModel);
        jLabelModel.setBounds(168, 115, 90, 17);

        jTextFieldModel.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldModel.setText("King");
        jPanel1.add(jTextFieldModel);
        jTextFieldModel.setBounds(210, 115, 50, 17);

        jLabelRate.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jLabelRate.setText("Rate:");
        jPanel1.add(jLabelRate);
        jLabelRate.setBounds(270, 115, 90, 17);

        jTextFieldRate.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jTextFieldRate.setText("$250");
        jPanel1.add(jTextFieldRate);
        jTextFieldRate.setBounds(300, 115, 50, 17);

        jButtonRegisterCustomer.setFont(new Font("Times New Roman", 1, 11)); // NOI18N
        jButtonRegisterCustomer.setText("Register Customer");
        jPanel1.add(jButtonRegisterCustomer);
        jButtonRegisterCustomer.setBounds(225, 150, 150, 25);

        jButtonGetAvailableRoom.setFont(new Font("Times New Roman", 1, 11)); // NOI18N
        jButtonGetAvailableRoom.setText("See Available Rooms");
        jButtonGetAvailableRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetAvailableRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGetAvailableRoom);
        jButtonGetAvailableRoom.setBounds(50, 150, 150, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 300);

        pack();
    }

    private void jButtonGetAvailableRoomActionPerformed(ActionEvent evt) {
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
    private javax.swing.JLabel jLabelCheckoutDate;
    private javax.swing.JLabel jLabelCheckoutDateDay;
    private javax.swing.JLabel jLabelCheckoutDateMonth;
    private javax.swing.JLabel jLabelCheckoutDateTime;
    private javax.swing.JLabel jLabelCheckoutDateYear;
    private javax.swing.JLabel jLabelDestinationCity;
    private javax.swing.JLabel jLabelCheckinDate;
    private javax.swing.JLabel jLabelCheckinDateDay;
    private javax.swing.JLabel jLabelCheckinDateMonth;
    private javax.swing.JLabel jLabelCheckinDateTime;
    private javax.swing.JLabel jLabelCheckinDateYear;

    private javax.swing.JLabel jLabelHotel;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelRate;

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


    private javax.swing.JTextField jTextFieldHotel;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldRate;
}

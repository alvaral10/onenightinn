package com.onenightinn.model.view.registercustomerjframe;

import com.onenightinn.model.domain.Customer;

import java.io.Serial;

public class RegisterCustomerJFrame extends javax.swing.JFrame {

    @Serial
    private static final long serialVersionUID = -685641941903021280L;

    private final RegisterCustomerJFrameController registerCustomerJFrameController;

    public RegisterCustomerJFrame() {
        initComponents();

        registerCustomerJFrameController = new RegisterCustomerJFrameController(this);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setJMenuBar(JMenuBar);
        jFileMenu = new javax.swing.JMenu();
        jFileMenuItem = new javax.swing.JMenuItem();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelCheckinDateDay = new javax.swing.JLabel();
        jLabelCheckoutDateDay = new javax.swing.JLabel();
        jTextFieldHomePhone = new javax.swing.JTextField();
        jTextFieldWorkPhone = new javax.swing.JTextField();

        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Registration");
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(233, 233, 246));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabelFirstName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelFirstName.setText("First Name:");
        jPanel1.add(jLabelFirstName);
        jLabelFirstName.setBounds(40, 20, 70, 17);

        jTextFieldFirstName.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldFirstName.setText("Stewie");
        jPanel1.add(jTextFieldFirstName);
        jTextFieldFirstName.setBounds(130, 20, 120, 22);

        jLabelLastName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelLastName.setText("Last Name:");
        jPanel1.add(jLabelLastName);
        jLabelLastName.setBounds(40, 50, 70, 17);

        jTextFieldLastName.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldLastName.setText("Griffin");
        jPanel1.add(jTextFieldLastName);
        jTextFieldLastName.setBounds(130, 50, 120, 22);

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelEmail.setText("Email: ");
        jPanel1.add(jLabelEmail);
        jLabelEmail.setBounds(40, 80, 80, 17);

        jTextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldEmail.setText("family@guy.com");
        jPanel1.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(130, 80, 120, 20);

        jLabelCheckinDateDay.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelCheckinDateDay.setText("Home Phone: ");
        jPanel1.add(jLabelCheckinDateDay);
        jLabelCheckinDateDay.setBounds(40, 140, 70, 17);

        jTextFieldHomePhone.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldHomePhone.setText("333.333.3333");
        jPanel1.add(jTextFieldHomePhone);
        jTextFieldHomePhone.setBounds(130, 140, 120, 20);

        jLabelCheckoutDateDay.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelCheckoutDateDay.setText("Work Phone: ");
        jPanel1.add(jLabelCheckoutDateDay);
        jLabelCheckoutDateDay.setBounds(40, 170, 100, 17);

        jTextFieldWorkPhone.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldWorkPhone.setText("777.777.7777");
        jPanel1.add(jTextFieldWorkPhone);
        jTextFieldWorkPhone.setBounds(130, 170, 120, 20);

        jLabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelPassword.setText("Password: ");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(40, 110, 90, 17);

        jTextFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextFieldPassword.setText("brian");
        jPanel1.add(jTextFieldPassword);
        jTextFieldPassword.setBounds(130, 110, 120, 20);

        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonCancel.setText("Cancel");
        jPanel1.add(jButtonCancel);
        jButtonCancel.setBounds(150, 200, 80, 25);

        jButtonOk.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonOk.setText("Ok");
        jPanel1.add(jButtonOk);
        jButtonOk.setBounds(60, 200, 80, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 400);

        pack();
    }

    public javax.swing.JMenuItem getFileMenuItem()
    {
        return jFileMenuItem;
    }

    public Customer getSelectedData()
    {
        Customer customer = new Customer (
                jTextFieldFirstName.getText(),
                jTextFieldLastName.getText(),
                jTextFieldEmail.getText(),
                jTextFieldPassword.getText(),
                jTextFieldHomePhone.getText(),
                jTextFieldWorkPhone.getText());

        return customer;
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
                RegisterCustomerJFrame itineraryJFrame = new RegisterCustomerJFrame();

                //itineraryJFrame.setSize(350,300);
                //itineraryJFrame.setVisible(true);
                //new ItineraryJFrame().setVisible(true);
            }
        });
    }


    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem jFileMenuItem;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelCheckinDateDay;
    private javax.swing.JLabel jLabelCheckoutDateDay;

    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldHomePhone;
    private javax.swing.JTextField jTextFieldWorkPhone;
}

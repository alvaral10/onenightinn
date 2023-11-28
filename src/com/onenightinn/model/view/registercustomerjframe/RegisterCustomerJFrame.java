package com.onenightinn.model.view.registercustomerjframe;

import com.onenightinn.model.domain.Customer;

import java.io.Serial;

public class RegisterCustomerJFrame extends javax.swing.JFrame {

    @Serial
    private static final long serialVersionUID = -685641941903021280L;

    private RegisterCustomerJFrameController registerCustomerJFrameController;

    public RegisterCustomerJFrame() {
        initComponents();

        registerCustomerJFrameController = new RegisterCustomerJFrameController(this);

        this.setSize(350, 300);
        this.setVisible(true);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Registration");
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(233, 233, 246));
        jPanel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabelFirstName.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabelFirstName.setText("First Name:");
        jPanel1.add(jLabelFirstName);
        jLabelFirstName.setBounds(40, 20, 70, 17);

        jTextFieldFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jTextFieldFirstName.setText("Stewie");
        jPanel1.add(jTextFieldFirstName);
        jTextFieldFirstName.setBounds(130, 20, 120, 22);

        jLabelLastName.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabelLastName.setText("Last Name :");
        jPanel1.add(jLabelLastName);
        jLabelLastName.setBounds(40, 50, 70, 17);

        jTextFieldLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jTextFieldLastName.setText("Griffin");
        jPanel1.add(jTextFieldLastName);
        jTextFieldLastName.setBounds(130, 50, 120, 22);

        jLabelEmail.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabelEmail.setText("Email : ");
        jPanel1.add(jLabelEmail);
        jLabelEmail.setBounds(70, 80, 80, 17);

        jTextFieldEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jTextFieldEmail.setText("family@guy.com");
        jPanel1.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(130, 80, 120, 20);

        jLabelPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabelPassword.setText("Password : ");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(50, 110, 90, 17);

        jTextFieldPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jTextFieldPassword.setText("brian");
        jPanel1.add(jTextFieldPassword);
        jTextFieldPassword.setBounds(130, 110, 120, 20);

        jButtonCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonCancel.setText("Cancel");
        jPanel1.add(jButtonCancel);
        jButtonCancel.setBounds(150, 140, 80, 25);

        jButtonOk.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButtonOk.setText("Ok");
        jPanel1.add(jButtonOk);
        jButtonOk.setBounds(50, 140, 80, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 200);

        pack();
    }

    public Customer getSelectedData()
    {
        Customer customer = new Customer (
                jTextFieldFirstName.getText(),
                jTextFieldLastName.getText(),
                jTextFieldEmail.getText(),
                jTextFieldPassword.getText());
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

    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassword;
}

package com.onenightinn.model.view.registercustomerjframe;

import com.onenightinn.model.business.manager.RoomRentalManager;
import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.view.Utils;
import com.onenightinn.model.view.MessageDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCustomerJFrameController implements ActionListener {

    private RegisterCustomerJFrame registerCustomerJFrame;

    public RegisterCustomerJFrameController(){

    }

    public RegisterCustomerJFrameController(RegisterCustomerJFrame registerCustomerJFrame){

        this.registerCustomerJFrame = registerCustomerJFrame;

        registerCustomerJFrame.getOkButton().addActionListener(this);
        registerCustomerJFrame.getCancelButton().addActionListener(this);

        Utils.centerWindow(registerCustomerJFrame);
        registerCustomerJFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

        System.out.println("Inside RegisterCustomerJFrameController::actionPerformed");

        if (event.getSource().equals(registerCustomerJFrame.getOkButton()))
            ok_actionPerformed(event);
        else if (event.getSource().equals(registerCustomerJFrame.getCancelButton()))
            cancel_actionPerformed(event);
    }

    private void cancel_actionPerformed(ActionEvent event) {
        registerCustomerJFrame.setVisible(false);
        registerCustomerJFrame.dispose();
    }

    private  void ok_actionPerformed(ActionEvent event){
        Customer customer = registerCustomerJFrame.getSelectedData();

        Composite composite = new Composite();
        composite.setCustomer(customer);

        RoomRentalManager roomRentalManager = RoomRentalManager.getInstance();
        if (roomRentalManager != null)
        {
            boolean action =  roomRentalManager.performAction("RegisterCustomer", composite);


            if (action)
            {
                MessageDialog dlg = new MessageDialog( "Registration Confirmation" , "You are successfully registered!");
                Utils.centerWindow(dlg);
                dlg.setModal(true);
                dlg.show();

                // tear down registration dialog
                registerCustomerJFrame.setVisible(false);
                registerCustomerJFrame.dispose();

            }
            else
            {
                MessageDialog dlg = new MessageDialog( "Registration Confirmation" , "Registration Failed. Please try back later!");
                Utils.centerWindow(dlg);
                dlg.setModal(true);
                dlg.show();

            }
        }
        else
        {
            MessageDialog dlg = new MessageDialog( "Internal Error" , "Registration Failed. Please try back later!");
            Utils.centerWindow(dlg);
            dlg.setModal(true);
            dlg.show();

        }

    }
}

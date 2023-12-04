package com.onenightinn.model.view.mainjframe;

import com.onenightinn.model.view.MessageDialog;
import com.onenightinn.model.view.Utils;
import com.onenightinn.model.view.registercustomerjframe.RegisterCustomerJFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainJFrameController implements ActionListener {

    private MainJFrame itineraryJFrame;

    public MainJFrameController(){

    }

    public MainJFrameController (MainJFrame itineraryJFrame){

        this.itineraryJFrame = itineraryJFrame;

        itineraryJFrame.getFileMenuItem().addActionListener(this);
        itineraryJFrame.getExitMenuItem().addActionListener(this);
        itineraryJFrame.getGetAvailableRoomButton().addActionListener(this);
        itineraryJFrame.getGetRegisterCustomerButton().addActionListener(this);

        // center the frame
        Utils.centerWindow(itineraryJFrame);
        itineraryJFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {

        System.out.println ("Inside MainJFrameController::actionPerformed");

        if (event.getSource().equals(itineraryJFrame.getFileMenuItem()))
            menuSampleOpen_actionPerformed(event);
        else if (event.getSource().equals(itineraryJFrame.getExitMenuItem()))
            menuExit_actionPerformed(event);
        else if (event.getSource().equals(itineraryJFrame.getGetAvailableRoomButton()))
            getAvailableRoom_actionPerformed(event);
        else if (event.getSource().equals(itineraryJFrame.getGetRegisterCustomerButton()))
            getRegisterCustomer_actionPerformed(event);
    }

    void menuSampleOpen_actionPerformed(ActionEvent actionEvent)
    {

        MessageDialog dlg = new MessageDialog( "Example", " Nothing to see here!");
        Utils.centerWindow(dlg);
        dlg.setModal(true);
        dlg.show();

    }


    /**
     * Exits the app
     */
    void menuExit_actionPerformed(ActionEvent actionEvent)
    {

        System.out.println ("You Clicked on the Exit App!");
        System.exit(1);
    }

    void getAvailableRoom_actionPerformed(ActionEvent actionEvent)
    {
        System.out.println("Inside ItineraryJFrameController");
        MessageDialog dlg = new MessageDialog( "Room Availability", "Not Implemented Yet!");
        Utils.centerWindow(dlg);
        dlg.setModal(true);
        dlg.show();

    }

    private void getRegisterCustomer_actionPerformed(ActionEvent event) {

        RegisterCustomerJFrame registerCustomerJFrame = new RegisterCustomerJFrame();
        registerCustomerJFrame.show();
    }
}

package com.onenightinn.model.view.roomjframe;

import com.onenightinn.model.business.manager.RoomRentalManager;
import com.onenightinn.model.domain.AvailableRoom;
import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.view.MessageDialog;
import com.onenightinn.model.view.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvailableRoomJFrameController implements ActionListener {

    private AvailableRoomJFrame availableRoomJFrame;
    public AvailableRoomJFrameController(){

    }

    public AvailableRoomJFrameController(AvailableRoomJFrame availableRoomJFrame){

        this.availableRoomJFrame = availableRoomJFrame;

        availableRoomJFrame.getFileMenuItem().addActionListener(this);
        availableRoomJFrame.getAvailableRoomButton().addActionListener(this);

        Utils.centerWindow(availableRoomJFrame);
        availableRoomJFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("Inside availableRoomJFrame::actionPerformed");

        if (event.getSource().equals(availableRoomJFrame.getFileMenuItem()))
            menuFileOpen_actionPerformed(event);
        else if (event.getSource().equals(availableRoomJFrame.getAvailableRoomButton()))
            getAvailableRoom_actionPerformed(event);
    }

    void menuFileOpen_actionPerformed(ActionEvent actionEvent) {

        MessageDialog dlg = new MessageDialog("File Open", " Read comments in callback code");
        Utils.centerWindow(dlg);
        dlg.setModal(true);
        dlg.show();

        return;
    } // end menuFileOpen_actionPerformed

    void getAvailableRoom_actionPerformed(ActionEvent actionEvent) {
        System.out.println("Inside availableRoomJFrameController");
        MessageDialog dlg = new MessageDialog("Rental Availability", "Searching For Rooms!");
        Utils.centerWindow(dlg);
        dlg.setModal(true);
        dlg.show();

        return;
    } // end menuFileOpen_actionPerformed

    private void enter_actionPerformed(ActionEvent event) {
        AvailableRoom availableRoom = AvailableRoomJFrame.getSelectedData();

        Composite composite = new Composite();
        composite.setAvailableRoom(availableRoom);

        RoomRentalManager roomRentalManager = RoomRentalManager.getInstance();
        if (roomRentalManager != null) {
            boolean action = roomRentalManager.performAction("RoomRental", composite);

            if (action) {
                MessageDialog dlg = new MessageDialog("Room Rental Confirmation", "You succesfully entered a rental!");
                Utils.centerWindow(dlg);
                dlg.setModal(true);
                dlg.show();

                // tear down registration dialog
                availableRoomJFrame.setVisible(false);
                availableRoomJFrame.dispose();

            } else {
                MessageDialog dlg = new MessageDialog("Store Rental Confirmation",
                        "Rental Failed. Please try back later!");
                Utils.centerWindow(dlg);
                dlg.setModal(true);
                dlg.show();

            }
        } else {
            MessageDialog dlg = new MessageDialog("Internal Error", "Rental Failed. Please try back later!");
            Utils.centerWindow(dlg);
            dlg.setModal(true);
            dlg.show();

        }
    }
}

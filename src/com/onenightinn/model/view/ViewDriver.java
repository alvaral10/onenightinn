package com.onenightinn.model.view;

import com.onenightinn.model.view.mainjframe.MainJFrameController;
import com.onenightinn.model.view.mainjframe.MainJFrame;

import javax.swing.*;

public class ViewDriver {
    /** Creates a new instance of ViewDriver */
    public ViewDriver()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //create view class
        MainJFrame mainJFrame = new MainJFrame();

        // Create Controller class and set the view
        MainJFrameController mainJFrameController =
                new MainJFrameController(mainJFrame);

    }

    /**
     * View entry point.
     *
     * @param args String[] - Arguments that can be passed to the Application
     */
    public static void main(String[] args) {
        new ViewDriver();
    }
}

package com.vvcode.monguito;

import com.vvcode.monguito.ui.MonguitoUI;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class App {

    public static void main(String[] args) {
        try {

          // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        // Set System L&F
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        MonguitoUI monguitoUI = new MonguitoUI();
        monguitoUI.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

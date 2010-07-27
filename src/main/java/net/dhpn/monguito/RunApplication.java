package net.dhpn.monguito;

import javax.swing.UIManager;
import net.dhpn.monguito.entities.Configuration;
import net.dhpn.monguito.utils.ConfigurationUtil;
import net.dhpn.monguito.views.MonguitoView;

public class RunApplication {

    public static void main(String args[]) {
        try {

            ConfigurationUtil configurationUtil = new ConfigurationUtil();
            Configuration configuration = configurationUtil.getConfiguration();

            if (configuration.getLookAndFeel() != null && configuration.getLookAndFeel().equals("System")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }

            MonguitoView monguitoView = new MonguitoView(configuration);
            monguitoView.setVisible(true);


        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}

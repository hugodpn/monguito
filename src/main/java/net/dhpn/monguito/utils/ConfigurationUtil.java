package net.dhpn.monguito.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import net.dhpn.monguito.entities.Configuration;
import net.dhpn.monguito.entities.Connection;

public class ConfigurationUtil {

    private String configPath;

    public ConfigurationUtil() {
        configPath = "mongito_config.xml";
    }

    public Configuration getConfiguration() {

        Configuration configuration = null;

        try {

            File file = new File(configPath);
            JAXBContext context = JAXBContext.newInstance(Configuration.class);

            if (existConfigFile()) {

                configuration = (Configuration) context.createUnmarshaller().unmarshal(
                        new StringReader(getContent(file)));

            } else {

                configuration = new Configuration();
                configuration.setLookAndFeel("Metal");

                Connection connection = new Connection();
                connection.setName("localhost");
                connection.setHost("localhost");
                connection.setPort(27017);
                configuration.getConnections().add(connection);

                connection = new Connection();
                connection.setName("localhost2");
                connection.setHost("localhost2");
                connection.setPort(270172);
                configuration.getConnections().add(connection);

                save(configuration);


            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        return configuration;
    }

    private boolean existConfigFile() {

        File file = new File(configPath);
        return file.exists() && file.canRead();

    }

    private String getContent(File file) {

        try {

            StringBuilder content = new StringBuilder();
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = input.readLine()) != null) {
                content.append(line);
            }

            input.close();

            return content.toString();

        } catch (Exception e) {
            System.err.println(e.toString());
            return null;
        }
    }

    public void save(Configuration conf) {

        try {

            File file = new File(configPath);
            JAXBContext context = JAXBContext.newInstance(Configuration.class);

            FileOutputStream outputFile = new FileOutputStream(file);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(conf, outputFile);

        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    public boolean exist(String name, Configuration configuration) {

        for (Connection c : configuration.getConnections()) {
            if (c.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void update(String name, String host, int port, Configuration configuration) {
        for (Connection c : configuration.getConnections()) {
            if (c.getName().equals(name)) {
                c.setHost(host);
                c.setPort(port);
                save(configuration);
                return;
            }
        }
    }

    public Connection getConnection(String connectionName, Configuration configuration) {
        for (Connection c : configuration.getConnections()) {
            if (c.getName().equals(connectionName)) {
                return c;
            }
        }
        return null;
    }
}

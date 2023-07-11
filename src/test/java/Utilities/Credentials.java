package Utilities;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Credentials {
    static final Properties prop = new Properties();
    public static String userProperty(String propiedad){

        try {
            prop.load(Files.newInputStream(Paths.get("credentials.properties")));
        } catch (Exception e) {

            e.printStackTrace();
        }
    return prop.getProperty(propiedad);

    }
}

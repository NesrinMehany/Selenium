package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

    public static String configReader(String key) {
        String path = "Data/Config.Properties";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties pr = new Properties();


       try{
           pr.load(fis);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        String value = pr.getProperty(key);
        return value;
    }

    public static void configadd(String key, String value) throws IOException {
        String path = "Data/Config.Properties";
        FileOutputStream fos = new FileOutputStream(path);
        Properties prop = new Properties();
        prop.setProperty(key, value);
        prop.store(fos, "newKey");
    }
}
package Utilit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    public ConfProperties() {
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException var9) {
            var9.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException var8) {
                    var8.printStackTrace();
                }
            }

        }

    }
}

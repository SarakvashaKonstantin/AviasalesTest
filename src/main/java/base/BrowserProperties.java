package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserProperties {

    private static ClassLoader classLoader = BrowserProperties.class.getClassLoader();
    private static File configFile = new File(classLoader.getResource("config.properties").getFile());
    private static File userDataFile = new File(classLoader.getResource("testData.properties").getFile());

    private static String userDataPath = userDataFile.getAbsolutePath();
    private static String configPath = configFile.getAbsolutePath();
    protected static FileInputStream fileInputStream;
    protected static Properties properties;


    public static String getConfigProperty(String prop) {
        try {
            fileInputStream = new FileInputStream(configPath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(prop);
    }

    public static String getTestDataProperty(String prop) {
        try {
            fileInputStream = new FileInputStream(userDataPath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(prop);
    }
}

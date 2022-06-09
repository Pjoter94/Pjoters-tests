package demoqacom.utills;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "configs/Config.properties";


    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Config.properties not found at " + propertyFilePath);
        }
    }

    public String getBrowser() {
        String driverPath = properties.getProperty("browser");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("browser is not specified in the Config.properties file.");
    }

    public String getChromeDriverPath() {
        String driverPath = properties.getProperty("chromeDriverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("chromeDriverPath is not specified in the Config.properties file.");
    }

    public String getFirefoxDriverPath() {
        String driverPath = properties.getProperty("firefoxDriverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("firefoxDriverPath is not specified in the Config.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait is not specified in the Config.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("baseUrl");
        if (url != null) return url;
        else throw new RuntimeException("baseUrl is not specified in the Config.properties file.");
    }
}

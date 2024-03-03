package org.example;

import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = AppConfig.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

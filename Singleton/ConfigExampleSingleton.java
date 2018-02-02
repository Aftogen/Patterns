import java.util.*;
import java.io.*;

public class ConfigExampleSingleton {
    private static ConfigExampleSingleton _instance = null;

    private Properties props = null;

    private ConfigExampleSingleton() {
        props = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    new File("props.txt"));
            props.load(fis);
        } catch (Exception e) {
            // обработайте ошибку чтения конфигурации
        }
    }

    public synchronized static ConfigExampleSingleton getInstance() {
        if (_instance == null)
            _instance = new ConfigExampleSingleton();
        return _instance;
    }

    // получить значение свойства по имени
    public synchronized String getProperty(String key) {
        String value = null;
        if (props.containsKey(key))
            value = (String) props.get(key);
        else {
            // сообщите о том, что свойство не найдено
        }
        return value;
    }
}

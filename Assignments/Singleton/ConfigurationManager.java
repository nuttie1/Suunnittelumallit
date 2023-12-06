package Assignments.Singleton;

import java.util.*;

/** Singleton use case example for configuration manager using ENUM class to store data.
 *
 */
public class ConfigurationManager {

    private static ConfigurationManager instance;
    public enum ConfigKey {
        APP_NAME("app.name"),
        APP_VERSION("app.version");

        private final String key;

        ConfigKey(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }
    private Map<ConfigKey, String> settings;

    private ConfigurationManager() {
        // Initialize settings
        settings = new HashMap<>();
        // Load default configuration settings
        settings.put(ConfigKey.APP_NAME, "MyApp");
        settings.put(ConfigKey.APP_VERSION, "1.0");
    }

    public static synchronized ConfigurationManager getInstance() {
        // If the instance is not created, create it
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(ConfigKey key) {
        return settings.get(key);
    }

    public void setConfig(ConfigKey key, String value) {
        settings.put(key, value);
    }
}


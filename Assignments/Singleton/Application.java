package Assignments.Singleton;

public class Application {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        String appName = configManager.getConfig(ConfigurationManager.ConfigKey.APP_NAME);
        String appVersion = configManager.getConfig(ConfigurationManager.ConfigKey.APP_VERSION);

        System.out.println("Application Name: " + appName);
        System.out.println("Application Version: " + appVersion);

        configManager.setConfig(ConfigurationManager.ConfigKey.APP_VERSION, "2.0");
        System.out.println("Updated Application Version: " + configManager.getConfig(ConfigurationManager.ConfigKey.APP_VERSION));
    }
}

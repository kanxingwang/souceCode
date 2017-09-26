package kan.javase.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbConfig {
	private String driver;
    private String url;
    private String userName;
    private String password;

    public DbConfig() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("kan/javase/jdbc/db-config.properties");
        Properties p=new Properties();
        try {
            p.load(inputStream);
            this.driver=p.getProperty("driver");
            this.url=p.getProperty("url");
            this.userName=p.getProperty("username");
            this.password=p.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getDriver() {
        return driver;
    }
    public String getUrl() {
        return url;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }


}

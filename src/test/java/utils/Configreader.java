package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configreader {
    Properties prop;

    public Configreader (){

    }
    public Properties ConfigurationManager() {
        this.prop = new Properties();
        File proFile = new File("src/test/resources/config/configfile.properties");

        try {
            FileInputStream fis = new FileInputStream(proFile);
            this.prop.load(fis);
        } catch (Throwable var3) {
            var3.printStackTrace();
        }

        return this.prop;
    }
    public String getusername (){
        String username = this.prop.getProperty("username");
        return  username;
    }
    public String geturl(){
        String url = this.prop.getProperty("url");
        return url;
    }
    public String getpassword(){
        String password = this.prop.getProperty("password");
        return password;
    }

}

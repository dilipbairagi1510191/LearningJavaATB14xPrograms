package Ready_Programs.ZDReadDataFrom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesifile {
    public static void main(String[] args) throws IOException {

        Properties prop=new Properties();

        FileInputStream fis=new FileInputStream("src/config.properties");
        prop.load(fis);

        String url=prop.getProperty("url");
        String user=prop.getProperty("UserName");
        String pass=prop.getProperty("Password");
        String browser=prop.getProperty("Browser");

        System.out.println("url+"+url);
        System.out.println("UserName...+"+user);
        System.out.println("password..."+pass);
        System.out.println("Browser..."+browser);


    }
}

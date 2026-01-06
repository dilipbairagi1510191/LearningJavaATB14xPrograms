package Day41;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFIle {
    public static void main(String[] args) throws IOException {

        //create object of Property class
        Properties propertiesobj=new Properties();

       //location of peroperty file
        FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\testData\\config.properties");

       //load the property file
        propertiesobj.load(file);

        String url=propertiesobj.getProperty("appurl");
        String email=propertiesobj.getProperty("email");
        String pwd=propertiesobj.getProperty("password");

        System.out.println(url+" " +email+" " +pwd);


    }


}

package Day42;

import org.testng.annotations.Test;

public class MyfirstTestcase {

   @Test(priority = 1)
    void openapp()
    {
        System.out.println("This opening app");
    }
    @Test(priority = 2)
    void login()
    {
        System.out.println("Login to  app.....");
    }

    @Test(priority = 3)
    void logout()
    {
        System.out.println("log out from app.....");
    }
}

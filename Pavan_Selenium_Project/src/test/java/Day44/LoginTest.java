package Day44;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(priority =1,groups = {"sanity"})
    void loginByEmail()
    {
        System.out.println("This is login by email.....");
    }
    @Test(priority = 2,groups = {"sanity"})
    void loginByfaceBook()
    {
        System.out.println("This is login by faceBook.....");
    }
    @Test(priority = 3,groups = {"sanity"})
    void loginByTwiter()
    {
        System.out.println("This is login by twiter.....");
    }

}

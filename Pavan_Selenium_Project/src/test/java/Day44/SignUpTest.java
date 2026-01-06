package Day44;

import org.testng.annotations.Test;

public class SignUpTest {

    @Test(priority =1, groups = {"regrassion"})
    void signupByEmail()
    {
        System.out.println("This is sigup by email.....");
    }
    @Test(priority =2,groups = {"regrassion"} )
    void signupByFacebook()
    {
        System.out.println("This is sighup by facebook.....");
    }
    @Test(priority =3,groups = {"regrassion"} )
    void signupBytwiter()
    {
        System.out.println("This is sighnup by twiter.....");
    }
}

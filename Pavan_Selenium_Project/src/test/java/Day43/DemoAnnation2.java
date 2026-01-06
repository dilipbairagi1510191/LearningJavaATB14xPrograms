package Day43;
import org.testng.annotations.*;

public class DemoAnnation2 {

        // 1. Executes **only once** before entire suite starts
        @BeforeSuite
        void bs() {
            System.out.println(">>> BeforeSuite: Executing before the whole test suite...");
        }

        // 2. Executes **only once** after entire suite completes
        @AfterSuite
        void as() {
            System.out.println(">>> AfterSuite: Executing after the whole test suite...");
        }

        // 3. Executes before <test> tag inside XML
        @BeforeTest
        void bt() {
            System.out.println(">>> BeforeTest: Executing before test tag in XML...");
        }

        // 4. Executes after <test> tag inside XML
        @AfterTest
        void at() {
            System.out.println(">>> AfterTest: Executing after test tag in XML...");
        }

        // 5. Executes before every class
        @BeforeClass
        void bc() {
            System.out.println(">>> BeforeClass: Executing before class...");
        }

        // 6. Executes after every class
        @AfterClass
        void ac() {
            System.out.println(">>> AfterClass: Executing after class...");
        }

        // 7. Executes before every @Test method
        @BeforeMethod
        void bm() {
            System.out.println(">>> BeforeMethod: Executing before each test method...");
        }

        // 8. Executes after every @Test method
        @AfterMethod
        void am() {
            System.out.println(">>> AfterMethod: Executing after each test method...");
        }

        // ---- Test Cases -----

        @Test
        void test1() {
            System.out.println("### Test1: Executing test case 1");
        }

        @Test
        void test2() {
            System.out.println("### Test2: Executing test case 2");
        }
    }



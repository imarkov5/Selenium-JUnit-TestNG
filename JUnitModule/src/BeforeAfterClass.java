import org.junit.*;

public class BeforeAfterClass {
    //using beforeClass and AfterClass annotations require methods to be static
    @BeforeClass
    public static void startBrowser(){
        System.out.println("starting browser...");
    }
    @AfterClass
    public static void closeBrowser(){
        System.out.println("closing browser...");
    }
//    Setup
    @Before
    public void enterURL(){
        System.out.println("Pasting URL...");
    }
//    Tear down
    @After
    public void cleanUpSession(){
        System.out.println("Deleting session...");
    }
    @Test
    public void testCase_01(){
        System.out.println("Test Case 1");
    }
    @Test
    public void testCase_02(){
        System.out.println("Test Case 2");
    }
    @Ignore
    public void testCase_03(){
        System.out.println("Test Case 3");
    }
}

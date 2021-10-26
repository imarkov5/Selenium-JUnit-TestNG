import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest_01 {
    @Test
    public void testCase_01(){
        System.out.println("Test Case 1");
    }
    @Before
    public void startBrowser(){
        System.out.println("starting browser...");
    }
    @After
    public void closeBrowser(){
        System.out.println("closing browser...");
    }

}

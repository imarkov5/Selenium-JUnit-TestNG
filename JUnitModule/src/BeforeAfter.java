import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfter {
    @Before
    public void startBrowser(){
        System.out.println("starting browser...");
    }
    @After
    public void closeBrowser(){
        System.out.println("closing browser...");
    }
    @Test
    public void testCase_01(){
        System.out.println("Test Case 1");
    }
    @Test
    public void testCase_02(){
        System.out.println("Test Case 2");
    }
    @Test
    public void testCase_03(){
        System.out.println("Test Case 3");
    }

}

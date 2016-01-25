import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shaungould on 1/25/16.
 */
public class WaxSpec {
    App app;
    Skier skier;
    Wax wax;
    @Before
    public void initialize(){
        app = new App();
        skier = new Skier();
        wax = new Wax(31, 1);
    }

    @Test
    public void getTempTest(){
        assertNotNull("Test Failed: the method returned null", wax.getTempGroup());
    }

    @Test
    public void getSnowTest(){
        assertNotNull("Test Failed: the method returned null", wax.getSnowGroup());


    }
    @Test
    public void constructorTest(){
        assertNotNull("Test Failed: the method returned null", wax.getSnowGroup());
    }


}

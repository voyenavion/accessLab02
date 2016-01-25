import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shaungould on 1/25/16.
 */
public class AppSpec {
    App app;
    Skier skier;
    Wax wax;
    @Before
    public void initialize(){
        app = new App();
       // skier = new Skier();
        wax = new Wax(4, 2);
    }

    @Test
    public void matchTest(){
        //assertNotNull("Test Failed: the method returned null", app.match(skier));
    }

    @Test
    public void displayTest(){
        assertEquals("Test Failed: did not display " + wax.getSnowGroup() + " correctly.", null, wax.getSnowGroup());
        app.displayWax(wax);

    }




}

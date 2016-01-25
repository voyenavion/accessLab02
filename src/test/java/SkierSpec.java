
import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shaungould on 1/25/16.
 */
public class SkierSpec {
    App app;
    Skier skier;
    @Before
    public void initialize(){
        app = new App();
        skier = new Skier();
    }

    @Test
    public void matchTest(){
        assertNotNull("Test Failed: the method returned null", app.match(skier));
    }

}

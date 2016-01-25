/**
 * Created by shaungould on 1/25/16.
 */
public class AccessLab02 {

    public static void main(String[] args) {
        Skier skier = new Skier();
        App app = new App();

        app.displayWax(app.match(skier));
    }

}

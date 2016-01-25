import java.util.Scanner;

/**
 * Created by shaungould on 1/25/16.
 */
public class Skier {
    Scanner scan = new Scanner(System.in);
    int tempInput;
    int snowInput;

    public Skier(){
        tempInput = receiveTemp("Please specify temp in Fahrenheit you are skiing in: ");
        snowInput = receiveSnow("Please specify snow conditions - 1 for powder, 2 for firm, 3 for crusty " +
                "(Enter ONE of these NUMBERS ONLY!): ");



    }
    int receiveTemp(String prompt){
        System.out.println(prompt);
        int temp = scan.nextInt();
        return temp;
    }
    int receiveSnow(String prompt){
        System.out.println(prompt);
        int snow = scan.nextInt();
        return snow;
    }
}

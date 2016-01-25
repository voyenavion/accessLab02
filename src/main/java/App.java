/**
 * Created by shaungould on 1/25/16.
 */
public class App {



    public Wax match(Skier skier){
        Wax chosenWax = new Wax(skier.tempInput, skier.snowInput);
        return chosenWax;
    }

    public void displayWax(Wax wax){

        if ((wax.getTempGroup()== Wax.TempColor.WHITE)||(wax.getTempGroup()== Wax.TempColor.YELLOW)){
            System.out.println("We have selected " + wax.getTempGroup() + " wax for you.");

        }else {
            System.out.println("We have selected " + wax.getSnowGroup() + wax.getTempGroup() +
                    " wax for you.");
        }
    }

}

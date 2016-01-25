/**
 * Created by shaungould on 1/25/16.
 */
public class Wax {
    enum TempColor {YELLOW, RED, VIOLET, BLUE, GREEN, WHITE}
    enum SnowType {SPECIAL_POWDER, STANDARD_FIRM, EXTRA_CRUSTY}
    private TempColor tempGroup;
    private SnowType snowGroup;

    public Wax(int temp, int snow){
        if(temp > 5){
            if(temp > 18){
                if(temp > 26){
                    if(temp > 31){
                        if(temp > 38){
                            tempGroup = TempColor.YELLOW;

                        }else{
                            tempGroup = TempColor.RED;

                        }
                    }else{
                        tempGroup = TempColor.VIOLET;

                    }
                }else{
                    tempGroup = TempColor.BLUE;

                }

            }else{
                tempGroup = TempColor.GREEN;
            }

        }else{
            tempGroup = TempColor.WHITE;
        }

        if (!((tempGroup==TempColor.YELLOW)||tempGroup==TempColor.WHITE)){
            switch(snow){
                case 1: snowGroup = SnowType.SPECIAL_POWDER; break;
                case 2: snowGroup = SnowType.STANDARD_FIRM; break;
                case 3: snowGroup = SnowType.EXTRA_CRUSTY; break;
                default:snowGroup = null;
            }

        } else {

            snowGroup = null;

        }




    }

    public void setTempGroup(TempColor color){
        this.tempGroup = color;
    }
    public void setSnowGroup(SnowType snow){
        this.snowGroup = snow;
    }

    public TempColor getTempGroup(){
        return this.tempGroup;

    }

    public SnowType getSnowGroup(){
        return this.snowGroup;
    }

    public void displayTempGroup(){
        System.out.println(getTempGroup());
    }

    public void displaySnowGroup(){
        System.out.println(getSnowGroup());
    }
}

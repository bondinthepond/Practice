/**
 * Created by aditya.mullela on 07/12/16.
 */
public class Die {

    public int rollDie(){

        int min = 1;
        int max = 6;
        return (int) (min + Math.round((max-min) * Math.random()));
    }
}

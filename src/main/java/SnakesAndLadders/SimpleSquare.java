/**
 * Created by aditya.mullela on 07/12/16.
 */
public class SimpleSquare extends BoardItem {

    private int position;

    public SimpleSquare(int position){
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() { return position; }

}

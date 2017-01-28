import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 07/12/16.
 */
public class SnakeSquare extends BoardItem {

    public SnakeSquare(){}

    public SnakeSquare(int position){
        this.position = position;
    }

    private int position;
    private int nextPosition;

    public int getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(int nextPosition) {
        this.nextPosition = nextPosition;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setThem(BoardItem[] boardItems) throws IOException {

        String command = "y";

        while(command != "n") {

            System.out.println("Enter the Source and Destination Of SnakeSquare");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String sourceDestinationPair = input.readLine();

            String[] arrayOfInputs = sourceDestinationPair.split(" ");
            Integer[] arrayOfIntegers = new Integer[arrayOfInputs.length];

            for (int i = 0; i<arrayOfInputs.length; i++) {
                arrayOfIntegers[i] = Integer.parseInt(arrayOfInputs[i]);
            }
            if(arrayOfIntegers[0] <= arrayOfIntegers[1]){
                System.out.println("SnakeSquare should be from a higher square to a lower square");
                System.out.println("Enter r to re-enter");
            } else {
                boardItems[arrayOfIntegers[0]] = new SnakeSquare(arrayOfIntegers[0]);
                boardItems[arrayOfIntegers[1]] = new SimpleSquare(arrayOfIntegers[1]);
                boardItems[arrayOfIntegers[0]].setNextPosition(arrayOfIntegers[1]);

                System.out.println("Enter y to add another snake, n to add ladder");
            }

            BufferedReader inputCommand = new BufferedReader(new InputStreamReader(System.in));
            command = inputCommand.readLine();

            if(command.equals("n")){
                break;
            }
        }


    }

}

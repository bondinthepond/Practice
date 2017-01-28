import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 07/12/16.
 */
public class LadderSquare extends BoardItem {

    public LadderSquare(){} //Default Constructor

    public LadderSquare(int position){
        this.position = position; //Constructor
    }

    private int position;
    private int nextPosition;

    public int getNextPosition() {
        return nextPosition;
    }

    @Override
    public void setNextPosition(int nextPosition) {
        this.nextPosition = nextPosition;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setThem(BoardItem[] boardItems) throws IOException {

        String command = "y";

        while (command != "n") {

            System.out.println("Enter the Source and Destination Of Ladder");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String sourceDestinationPair = input.readLine();

            String[] arrayOfInputs = sourceDestinationPair.split(" ");
            Integer[] arrayOfIntegers = new Integer[arrayOfInputs.length];

            for (int i = 0; i < arrayOfInputs.length; i++) {
                arrayOfIntegers[i] = Integer.parseInt(arrayOfInputs[i]);
            }
            if (arrayOfIntegers[0] >= arrayOfIntegers[1]) {
                System.out.println("Ladder should be from a lower square to a higher square");
                System.out.println("Enter r to re-enter");
            } else {
                boardItems[arrayOfIntegers[0]] = new LadderSquare(arrayOfIntegers[0]);
                boardItems[arrayOfIntegers[1]] = new SimpleSquare(arrayOfIntegers[1]);
                boardItems[arrayOfIntegers[0]].setNextPosition(arrayOfIntegers[1]);
                System.out.println("Enter y to add another Ladder, n to continue further");
            }

            BufferedReader inputCommand = new BufferedReader(new InputStreamReader(System.in));
            command = inputCommand.readLine();

            if (command.equals("n")) {
                break;
            }

        }
    }}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 06/12/16.
 */
public class Board {

    private int numberOfSquares;
    private static BoardItem[] boardItems;

    public BoardItem[] prepareBoard() throws IOException {

        System.out.println("Enter the number of boardItems on board");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String numberOfSquare = input.readLine();
        System.out.println("You selected :" + numberOfSquare);

        numberOfSquares = Integer.parseInt(numberOfSquare);

        boardItems = new BoardItem[numberOfSquares];

        SnakeSquare snakeSquare = new SnakeSquare();
        snakeSquare.setThem(boardItems);

        LadderSquare ladderSquare = new LadderSquare();
        ladderSquare.setThem(boardItems);

        for (int i = 0; i < numberOfSquares; i++) {
            if (boardItems[i] == null) {
                boardItems[i] = new SimpleSquare(i);
            }
        }

        System.out.println("Square from 0 to " + (numberOfSquares - 1));

        System.out.println("Board is ready");

        return boardItems;
    }
}


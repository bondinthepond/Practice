import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by aditya.mullela on 08/11/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BoardItem[] boardItems;
        Board board = new Board();

        boardItems = board.prepareBoard();


        System.out.println("Enter the number of players");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String players = input.readLine();
        System.out.println("You selected :" + players);

        int numberOfPlayers = Integer.parseInt(players);

        ArrayList<Player> arrayOfPlayers = new ArrayList<Player>();

        for(int i = 0; i < numberOfPlayers; i++){

            System.out.println("Enter the name of the player");

            BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
            String playerName = input1.readLine();

            Player player = new Player(playerName);
            arrayOfPlayers.add(player);
        }

        Game game = new Game(arrayOfPlayers, boardItems);
        game.gameOn();

        System.out.println("Game Over");
    }

}

import java.util.ArrayList;

/**
 * Created by aditya.mullela on 06/12/16.
 */
public class Game {

    private ArrayList<Player> arrayOfPlayers;
    private BoardItem[] boardItems;
    private Die die;

    public boolean thereIsAWinner = false;

    public Game(ArrayList<Player> arrayOfPlayers, BoardItem[] boardItems) {
        this.arrayOfPlayers = arrayOfPlayers;
        this.boardItems = boardItems;
    }

    public void gameOn(){

        System.out.println("Game On");

        die = new Die();

        do {
        for (Player p: arrayOfPlayers) {
            System.out.println("Current Player :" + p.getName());
            int currentRoll = die.rollDie();
            System.out.println(p.getName() + " rolled " + currentRoll);

            int currentPosition = p.getCurrentPosition();
            int nextPossiblePosition = p.getCurrentPosition()+currentRoll;

            if(nextPossiblePosition > boardItems.length - 1 ) {
                System.out.println("Roll exceeded the require, better luck next time");
            } else {
                p.setCurrentPosition(nextPossiblePosition);


            System.out.println(p.getName()+" moving from "+currentPosition+" to "+ nextPossiblePosition);


            if(boardItems[p.getCurrentPosition()].getClass() == SnakeSquare.class) {
                System.out.println("Oops a snake");
                SnakeSquare snakeSquare;
                snakeSquare = (SnakeSquare) boardItems[p.getCurrentPosition()];
                System.out.println("moving to " + snakeSquare.getNextPosition());
                p.setCurrentPosition(snakeSquare.getNextPosition());
            }

            if(boardItems[p.getCurrentPosition()].getClass() == LadderSquare.class){
                System.out.println("Yay a ladder");
                LadderSquare ladderSquare;
                ladderSquare = (LadderSquare) boardItems[p.getCurrentPosition()];
                System.out.println("Moving to " + ladderSquare.getNextPosition());
                p.setCurrentPosition(ladderSquare.getNextPosition());
            }

            if(p.getCurrentPosition() == (boardItems.length -1)) {
                thereIsAWinner = true;
                System.out.println("The winner is " + p.getName());
                break;
            }
        }
        }
        }while(thereIsAWinner == false);
    }
}

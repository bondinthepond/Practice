//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Created by aditya.mullela on 07/12/16.
// */
//public class RabbitSquare extends BoardItem {
//
//    public RabbitSquare(){}
//    public RabbitSquare(int position){
//        this.position = position;
//    }
//
//    private Board board;
//    private int position;
//    private BoardItem nextItem;
//
//    public BoardItem getNextItem() {
//        return nextItem;
//    }
//
//    public void setNextItem(BoardItem nextItem) {
//        int currentPosition = getPosition();
//        nextItem = currentPosition +
//        this.nextItem = nextItem;
//    }
//
//    public void setPosition(int position) {
//        this.position = position;
//    }
//
//    public int getPosition() {
//        return position;
//    }
//
//    public void setRabbit(BoardItem[] boardItems) throws IOException {
//
//
//        String command = "y";
//
//        while(command != "n") {
//
//            System.out.println("Enter the location Of RabbitSquare");
//            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//            String locationOfRabbit = input.readLine();
//
//            int rabbitLocation = Integer.parseInt(locationOfRabbit);
//
//            if(boardItems[rabbitLocation] == null || boardItems[rabbitLocation].getClass() == SimpleSquare.class){
//                boardItems[rabbitLocation] = new RabbitSquare(rabbitLocation);
//                boardItems[rabbitLocation].setNextItem();
//            } else {
//                System.out.println("Location already occupied, try another location");
//            }
//
//            BufferedReader inputCommand = new BufferedReader(new InputStreamReader(System.in));
//            command = inputCommand.readLine();
//
//            if(command.equals("n")){
//                break;
//            }
//        }
//
//
//    }
//
//
//}

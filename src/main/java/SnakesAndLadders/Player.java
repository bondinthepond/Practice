/**
 * Created by aditya.mullela on 06/12/16.
 */
public class Player {

        private String name;
        private int currentPosition = 0;

        public Player(String name) {
            this.name = name; //Constructor
        }

        public int getCurrentPosition() {
            return currentPosition;
        }

        public void setCurrentPosition(int currentPosition) {
            this.currentPosition = currentPosition;
        }

        public String getName() {
            return name;
        }

    }


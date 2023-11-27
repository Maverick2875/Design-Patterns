/**
 * The MoveBackward class represents a specific state, "Move Backward," in a hypothetical system. It extends the
 * abstract class State and defines behavior associated with this state.
 * 
 * @author AmanKhan
 * @version 4.1
 */
public class MoveBackward extends State {

    /**
     * Default constructor for the MoveBackward class. Sets the name of the state to "Move Backward" and initializes
     * the subState to "Accelerate."
     */
    MoveBackward() {
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }
    
    /**
     * Handles the event of pressing the left pedal a specific number of times. The behavior depends on the number of
     * times the left pedal is pressed and the current subState of the MoveBackward state.
     *
     * @param numOfTimesPressed The number of times the left pedal is pressed (1, 2, or 3).
     * @return True if the transition to a different state is successful, false otherwise.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 1:
                // Transition between Constant Speed and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Left Pedal once when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 2:
                // Transition between Accelerate and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Accelerate") {
                    System.out.println("Error: Can only press Left Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                } else {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 3:
                // Transition from Decelerate to At Rest state
                if (this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Left Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Left Pedal once, twice, or thrice when in Move Backward State.\nUnable to move.");
                break;
        }
        return move;
    }

    /**
     * Handles the event of pressing the left pedal for a specific duration of time. The behavior depends on the
     * duration of the pedal press and the current subState of the MoveBackward state.
     *
     * @param numOfSecondsPressed The duration for which the left pedal is pressed, in seconds (should be 3).
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        // Check if the pedal is pressed for 3 seconds in Accelerate or Constant Speed states
        if (numOfSecondsPressed != 3) {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States to move.\nUnable to move.");
            return;
        }
        // Check if the object is in Accelerate or Constant Speed states
        if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States.\nUnable to move.");
            return;
        }
        // Transition between Accelerate and Constant Speed states
        if (this.subState == "Accelerate") {
            System.out.println("Transitioning from Accelerate State to Constant Speed State...");
            this.subState = "Constant Speed";
            return;
        }
        System.out.println("Transitioning from Constant Speed State to Accelerate State...");
        this.subState = "Accelerate";
    }
}

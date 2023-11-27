/**
 * The MoveForward class represents a specific state, "Move Forward," in a hypothetical system. It extends the
 * abstract class State and defines behavior associated with this state.
 * 
 * @author AmanKhan
 * @version 4.2
 */
public class MoveForward extends State {
   
    /**
     * Default constructor for the MoveForward class. Sets the name of the state to "Move Forward" and initializes
     * the subState to "Accelerate."
     */
    MoveForward() {
        this.name = "Move Forward";
        this.subState = "Accelerate";
    }
  
    /**
     * Handles the event of pressing the right pedal a specific number of times. The behavior depends on the number
     * of times the right pedal is pressed and the current subState of the MoveForward state.
     *
     * @param numOfTimesPressed The number of times the right pedal is pressed (2 or 3).
     * @return True if the transition to a different state is successful, false otherwise.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 2:
                // Transition between Accelerate and Decelerate states
                if (this.subState != "Accelerate" && this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                } else {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            case 3:
                // Transition from Decelerate to At Rest state
                if (this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal twice or thrice when in Move Forward State.\nUnable to move.");
                break;
        }
        return move;
    }

    /**
     * Handles the event of pressing the right pedal for a specific duration of time. The behavior depends on the
     * duration of the pedal press and the current subState of the MoveForward state.
     *
     * @param numOfSecondsPressed The duration for which the right pedal is pressed, in seconds (3 or 5).
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        switch (numOfSecondsPressed) {
            case 3:
                // Transition between Constant Speed and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 3 seconds when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                } 
                break;
            case 5:
                // Transition between Accelerate and Constant Speed states
                if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 5 seconds when in Constant Speed or Accelerate States.\nUnable to move.");
                } else if (this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal for 3 or 5 seconds when in Move Forward State.\nUnable to move.");
                break;
        }
    }
}

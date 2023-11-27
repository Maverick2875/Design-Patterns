/**
 * The AtRest class represents a specific state, "At Rest," in a hypothetical system. It extends the abstract
 * class State and defines behavior associated with this state.
 * 
 * @author AmanKhan
 * @version 4.0
 */
public class AtRest extends State {

    /**
     * Default constructor for the AtRest class. Sets the name of the state to "At Rest" and initializes the
     * subState to "None."
     */
    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    /**
     * Handles the event of pressing the right pedal. In the "At Rest" state, the right pedal can only be pressed
     * once to transition to the "Move Forward" state.
     *
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    /**
     * Handles the event of pressing the left pedal for a specific duration of time. In the "At Rest" state, the
     * left pedal must be pressed for 5 seconds to transition to the "Move Backward" state.
     *
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Left Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}


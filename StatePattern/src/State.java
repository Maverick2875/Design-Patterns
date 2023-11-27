/**
 * The State class is a base class representing the states of a rover. It provides methods
 * that can be overridden by specific state implementations to define state-specific behavior.
 * 
 * @author AmanKhan
 * @version 4.4
 */
public class State {
    // Attributes representing the name and sub-state of the state
    protected String name = "NULL";
    protected String subState = "NULL";

    /**
     * Default constructor for the State class.
     */
    State() {}

    /**
     * Simulates the action of pressing the right pedal a certain number of times based on the current state.
     * This method is meant to be overridden by subclasses to define state-specific behavior.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the right pedal for a specific duration based on the current state.
     * This method is meant to be overridden by subclasses to define state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the right pedal is pressed.
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

    /**
     * Simulates the action of pressing the left pedal a certain number of times based on the current state.
     * This method is meant to be overridden by subclasses to define state-specific behavior.
     * 
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the left pedal for a specific duration based on the current state.
     * This method is meant to be overridden by subclasses to define state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the left pedal for a specific duration based on the current state,
     * without changing the state. This method is meant to be overridden by subclasses to define state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
}


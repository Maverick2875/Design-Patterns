
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * The StateTest class contains JUnit tests for the State class and its methods.
 * @author AmanKhan 
 * @version 4.5
 */

public class StateTest {
    
    /**
     * Default constructor for the StateTest class.
     */
    public StateTest() {
    }

    /**
     * Test case for the pressRightPedal method in the State class.
     */
    Rover r = new Rover();
       
    @Test
    public void testPressRightPedal() {
        
        // Test Case 1
        assertEquals("At Rest",r.currentState.name);
        
        // Test Case 2
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
       // Test Case 3
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

    /**
     * Test case for the printStateAndSubState method in the State class.
     * This method is not implemented in the provided code, so the test is empty.
     */
    @Test
    public void testPrintStateAndSubState() {
        // This method is not implemented in the provided code
    }

    /**
     * Test case for the main method in the State class.
     * This method is not implemented in the provided code, so the test is empty.
     */
    @Test
    public void testMain() {
        // This method is not implemented in the provided code
    }
    
}

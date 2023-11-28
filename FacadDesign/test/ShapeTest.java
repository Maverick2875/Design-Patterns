import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class serves as a set of unit tests for the various shape classes (Circle, Rectangle, Square).
 * It ensures that the drawing functionality of each shape produces the expected output.
 * @author AmanKhan
 * @version 2.6
 * 
 * 
 */
public class ShapeTest {
    
    /**
     * Constructs a new instance of ShapeTester.
     * The constructor is empty as there is no need for initialization.
     */
    public ShapeTest() {
    }
    
    // Create an instance of ShapeMaker to use its methods for testing
    ShapeMaker shapeMaker = new ShapeMaker();
  
    /**
     * This test method is designed to test the drawing functionality of the Circle class.
     * It creates an instance of Circle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawCircle method.
     */
    @Test
    public void testingCircle() {
        // Create an instance of Circle
        Circle cl = new Circle();

        // Assert that the draw method of Circle produces the expected output from ShapeMaker
        assertEquals(cl.draw(), shapeMaker.drawCircle());
    }

    /**
     * This test method is responsible for testing the drawing functionality of the Rectangle class.
     * It creates an instance of Rectangle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawRectangle method.
     */
    @Test
    public void testingRectangle() {
        // Create an instance of Rectangle
        Rectangle rect = new Rectangle();

        // Assert that the draw method of Rectangle produces the expected output from ShapeMaker
        assertEquals(rect.draw(), shapeMaker.drawRectangle());
    }

    /**
     * This test method is designed to test the drawing functionality of the Square class.
     * It creates an instance of Square and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawSquare method.
     */
    @Test
    public void testingSquare() {
        // Create an instance of Square
        Square sq = new Square();

        // Assert that the draw method of Square produces the expected output from ShapeMaker
        assertEquals(sq.draw(), shapeMaker.drawSquare());
    }
}


/*
 * @author AmanKhan
 * @version 2.4
 * The ShapeMaker class serves as a facade for drawing different shapes, providing
 * a simplified interface to interact with instances of Circle, Rectangle, and Square.
 * 
 */


public class ShapeMaker {

    // Attributes
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a ShapeMaker object and initializes instances of Circle, Rectangle, and Square.
     * This constructor sets up the ShapeMaker with the necessary objects to draw different shapes.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draws a circle using the stored Circle object.
     */
    public String drawCircle() {
       return circle.draw();
    }

    /**
     * Draws a rectangle using the stored Rectangle object.
     */
    public String drawRectangle() {
       return rectangle.draw();
    }

    /**
     * Draws a square using the stored Square object.
     */
    public String drawSquare() {
        return square.draw();
    }

   
}

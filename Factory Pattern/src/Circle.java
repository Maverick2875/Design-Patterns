
/**
 * 
 * @author User
 * @version 2.0
 * The Circle class represents a geometric shape in the form of a circle.
 * It implements the Shape interface, providing a common structure for
 * different types of shapes in a geometric context.
 * 
 */
public class Circle implements Shape {
     
     /**
     * Draws the representation of a circle.
     * 
     * This method is required to implement the draw() method from the Shape interface.
     * When called, it prints a message indicating that the circle is being drawn.
     * 
     **/
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}



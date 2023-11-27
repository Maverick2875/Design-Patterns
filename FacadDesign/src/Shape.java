


/**
 * @author User
 * @version 2.3
 * 
 * The Shape interface defines a contract for classes representing geometric shapes.
 * Classes implementing this interface are expected to provide specific details on
 * how a particular shape is drawn.
 */
public interface Shape {
    
    /**
     * Draws the shape.
     * 
     * Classes implementing this method should provide specific details on how the
     * shape is drawn. The implementation may involve printing to the console, graphical
     * rendering, or any other appropriate method to visually represent the shape.
     * 
     * @return A string representation or indication of the drawing process.
     * 
     * Note: The return type is String, but its content may vary based on the
     *       implementation. It is recommended to check the documentation of the
     *       specific implementation for details on the return value.
     */
    String draw();
    
}

 
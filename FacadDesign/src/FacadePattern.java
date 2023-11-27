/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * 
 * @author AmanKhan
 * @version 2.1
 * The FacadePattern class serves as an example of the Facade design pattern,
 * demonstrating the use of a simplified interface to interact with a system of
 * complex subsystems. It contains the main method to run the example.
 */
public class FacadePattern {
     /**
     * The main method to demonstrate the Facade pattern.
     * It creates a ShapeMaker object and uses its simplified interface
     * to draw a circle, rectangle, and square.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a ShapeMaker object
        ShapeMaker shapeMaker = new ShapeMaker();

        // Draw a circle using the simplified interface
        shapeMaker.drawCircle();

        // Draw a rectangle using the simplified interface
        shapeMaker.drawRectangle();

        // Draw a square using the simplified interface
        shapeMaker.drawSquare();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author User
 * @version 2.1
 * The FactoryPatternDemo class serves as a demonstration of the Factory design pattern,
 * showcasing the creation and usage of different shapes through a ShapeFactory.
 *
 */
public class FactoryPatternDemo {

    /**
     * The main method to demonstrate the Factory design pattern.
     * It creates a ShapeFactory, obtains different shapes, and calls their draw methods.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}



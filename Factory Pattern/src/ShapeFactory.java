/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author User
 * @version 2.4
 * The ShapeFactory class is a factory for creating instances of various geometric shapes.
 * It provides a method to get a specific shape based on the given shape type. 
 * 
 */
public class ShapeFactory {
     
     /**
     * Gets an instance of a specific geometric shape based on the provided shape type.
     *
     * @param shapeType A string representing the type of shape to be created.
     *                  Valid values include "CIRCLE", "RECTANGLE", and "SQUARE".
     *                  Case-insensitive comparison is used.
     *
     * @return An instance of the requested shape, or null if the provided shape type is invalid or null.
     *         The specific type of shape returned depends on the value of the shapeType parameter.
     *
     * Example:
     * ShapeFactory shapeFactory = new ShapeFactory();
     * Shape circle = shapeFactory.getShape("CIRCLE"); // Returns an instance of Circle.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}



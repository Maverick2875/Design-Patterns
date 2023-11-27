/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 * 
 * @author User
 * @version 2.3
 * The Shape interface represents a generic geometric shape in a two-dimensional space.
 * Classes that implement this interface are expected to provide specific
 * implementations for the drawing operation.
 */
public interface Shape {
    /**
     * Draws the representation of the geometric shape.
     * Implementing classes must provide a specific implementation for this method.
     *
     * The behavior of the draw() method depends on the specific type of shape
     * being implemented (e.g., Rectangle, Circle, etc.).
     */
    void draw();
}



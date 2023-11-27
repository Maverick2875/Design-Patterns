/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author User
 * @version 2.2
 * The Rectangle class represents a geometric shape in two-dimensional space.
 * It implements the Shape interface, providing a standard way to interact with
 * different shapes in a drawing application.
 * 
 */
public class Rectangle implements Shape {
    
    /**
     * Draws the representation of a rectangle. This method is required by the
     * Shape interface and must be implemented by any class that implements the
     * interface.
     *
     * The draw() method in the Rectangle class prints a message to the console
     * indicating that the drawing operation for a rectangle is being performed.
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}




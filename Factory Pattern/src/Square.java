/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author User
 * @version 2.5
 * The Square class represents a geometric shape with four equal sides in two-dimensional space.
 * It implements the Shape interface, providing a standard way to interact with
 * different shapes in a drawing application. 
 */
public class Square implements Shape {
    /** 
     * Draws the representation of a square. This method is required by the
     * Shape interface and must be implemented by any class that implements the
     * interface.
     * 
     * The draw() method in the Square class prints a message to the console
     * indicating that the drawing operation for a square is being performed.
     **/
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}


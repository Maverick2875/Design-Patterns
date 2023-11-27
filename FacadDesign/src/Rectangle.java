
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author AmanKhan
 * @version 2.2
 * The Rectangle class represents a geometric shape in the form of a rectangle.
 * It implements the Shape interface, providing a common structure for
 * different types of shapes in a geometric context.
 */
public class Rectangle implements Shape {

    /**
     * Draws the representation of a rectangle.
     *
     * This method is required to implement the draw() method from the Shape interface.
     * When called, it prints a message indicating that the rectangle is being drawn.
     *
     * @return null - The draw() method in the context of this class is designed
     *               to perform an action (drawing), and it does not return a meaningful value.
     */
    @Override
    public  String draw() {
        System.out.println("Rectangle::draw()");
        return null;
    }
}

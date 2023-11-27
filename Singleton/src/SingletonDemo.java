
/**
 * The SingletonDemo class is a demonstration class that showcases the usage of the Singleton design pattern
 * by obtaining and utilizing an instance of the SingleObject class.
 *
 * @author AmanKhan
 * @version 3.1
 */
public class SingletonDemo {

    /**
     * The main method is the entry point of the application. It demonstrates the usage of the Singleton
     * design pattern by obtaining an instance of the SingleObject class and invoking its showMessage method.
     *
     */
    public static void main(String[] args) {
       
        // Obtain the single instance of the SingleObject class
        SingleObject object = SingleObject.getInstance();

        // Display a "Hello World!" message using the obtained instance
        object.showMessage();
    }
}


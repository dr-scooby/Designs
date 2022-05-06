
/**
 * @author jismailx
 * Main application entry point
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start with the ShapeFactory
		ShapeFactory factory = new ShapeFactory();
		
		// get an object of Circle
		Shape shape1 = factory.getShape("CIRCLE");
		// call draw method of circle
		shape1.draw();
		
		// get an object of Rectangle
		Shape shape2 = factory.getShape("RECTANGLE");
		// call draw method 
		shape2.draw();
		
		// get an object of Square
		Shape shape3 = factory.getShape("SQUARE");
		// call draw method
		shape3.draw();
		
		// ask for a shape that doesn't exist
		Shape shape4 = factory.getShape("POLYTRIANGLE");
		shape4.draw();
	}

}

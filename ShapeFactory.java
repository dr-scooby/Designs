// interface that all classes will implement
public interface Shape {
	
	void draw();

}


public class Square implements Shape{

	public void draw() {
		System.out.println("Square::draw() method");
	}
}


public class Rectangle implements Shape{
	
	public void draw() {
		System.out.println("Rectangle::draw() method");
	}

}


public class Circle implements Shape{
	
	public void draw() {
		System.out.println("Circle::draw() method");
	}

}

/**
 * The factory to return the class based on type required
 */

/**
 * @author jismailx
 *
 */
public class ShapeFactory {
	
	
	public Shape getShape(String shapetype) {
		
		// null, default to Circle shape
		if(shapetype == null) {
			return new Circle();
		}
		
		if(shapetype.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapetype.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapetype.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else {
			// default to Circle
			return new Circle();
		}
		
		
	}

}

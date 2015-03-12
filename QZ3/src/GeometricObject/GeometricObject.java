package GeometricObject;

public abstract class GeometricObject {
	//Default constructor
	protected GeometricObject(){
		
	}
	//This is the abstract method to find the area
	public abstract double getArea();
	//This is the abstract method to find the perimeter
	public abstract double getPerimeter();
	//This is the abstract method to make the object a string
	public abstract String toString();
}

package GeometricObject;

public class triangle extends GeometricObject {
	private double Side1 = 1.0;
	private double Side2 = 1.0;
	private double Side3 = 1.0;

	public triangle() {

	}

	public triangle(double Side1, double Side2, double Side3) {
		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;

	}

	// Side1 getter
	public double getSide1() {
		return Side1;
	}

	// Side1 setter
	public void setSide1(double Side1) {
		this.Side1 = Side1;
	}

	// Side2 getter
	public double getSide2() {
		return Side2;
	}

	// Side2 setter
	public void setSide2(double Side2) {
		this.Side2 = Side2;
	}

	// Side3 getter
	public double getSide3() {
		return Side3;
	}

	// Side3 setter
	public void setSide3(double Side3) {
		this.Side3 = Side3;
	}

	// Calculate the Area
	public double getArea() {
		double a = Side1;
		double b = Side2;
		double c = Side3;
		double s = (a + b + c) / 2;
		// Using Heron's formula to get the area
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	// Calculate the Perimeter
	public double getPerimeter() {
		return (Side1 + Side2 + Side3);
	}

	// Convert the triangle to a string
	public String toString() {
		System.out.println("This triangle's perimeter is = "+ getPerimeter());
		System.out.println("This triangle's area is = %.2f"+ getArea());
		return("Side1's length is = "+ Side1+"\n Side2's length is = "+Side2+"\n Side3's length is = "+Side3);
	}
}
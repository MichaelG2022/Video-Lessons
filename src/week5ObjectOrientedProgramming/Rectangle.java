package week5ObjectOrientedProgramming;

public class Rectangle {
	
	private double width;			// When we first set this up, the yellow lightbulbs on the left told us width, length, and area
	private double length;				//  hadn't been used, and gave us the option to create the getter and setter for us 			
	private double area;				// We do not want a setter for area because that will be calculated privately in the Rectangle Class
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		area = width * length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		area = width * length;
	}

	public double getArea() {
		return area;
	}

} // end CLASS

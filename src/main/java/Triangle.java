package main.java;
/**
 * 
 * @author Toby
 * This Triangle class gets the area and perimeter of a given triangle (3 sides input needed)
 */
public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() throws Exception {
		Triangle Tri = new Triangle(side1,side2,side3);
	}		
		
	public Triangle(double side1,double side2,double side3) throws Exception {
		if (side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2){
			throw new Exception("These are impossible triangle dimensions.");
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	/**
	 * Returns the triangle area for given sides
	 */
	@Override
	public double getArea(){
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	/**
	 * Returns the triangle perimeter for given sides
	 */
	@Override
	public double getPerimeter(){
		double perimeter = (side1 + side2 + side3);
		return perimeter;
		
	}
	/**
	 * Returns the string description for given sides
	 */
	@Override
	public String toString(){
		String str = ("The triangle has a perimeter of: " + getPerimeter() + " units and an area of : " + getArea() +  " units squared.");
		return str;
	}
}

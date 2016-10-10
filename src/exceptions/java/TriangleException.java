package exceptions.java;
import main.java.Triangle;

public class TriangleException extends Exception{
	
	private Triangle Imaginary;
	
	public TriangleException(){
		System.out.println("This is an imaginary triangle. Please input the sides of a real triangle.");
	}
	
	
}


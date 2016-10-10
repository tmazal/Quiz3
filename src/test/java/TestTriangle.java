package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Triangle;

public class TestTriangle {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test (expected = Exception.class)
	public void testException() throws Exception{
		new Triangle(1,2,5);
	}
	
	@Test
	public void TestArea() {
		try{
			Triangle Tri1 = new Triangle(8,15,17);
			assertTrue(Tri1.getArea() == 60.0);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}	
	
	@Test
	public void TestPerimeter(){
		try{
			Triangle Tri1 = new Triangle(8,15,17);
			assertTrue(Tri1.getPerimeter() == 40.0);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void TesttoString(){		
		try{
			Triangle Tri1 = new Triangle(8,15,17);
			assertTrue(Tri1.toString().equals("The triangle has a perimeter of: 40.0 units and an area of : 60.0 units squared."));
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}	
}

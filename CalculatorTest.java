package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	public static Calculator cal = new Calculator();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Testing's start");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testing's over");
	}

	@Test
	public void testAdd() {
		cal.add(2, 2);
		assertEquals(4, cal.getResult());
	//fail("Not yet implemented");	
	}
	
	@Test
	public void testSubstract(){
		cal.substract(4, 2);
		assertEquals(2, cal.getResult());
	}
	
	@Ignore
	public void testMultiply(){
		fail("Not yet implemented");
	}
	
	@Test(timeout = 2000)
	public void testDivide(){
		for(;;);
	}
	
	@Test(expected = ArithmeticException.class)	
	public void testDivideByZero(){
		cal.divide(4, 0);
	}
	
	
	
	
	
	
	
	
	
	
	

}

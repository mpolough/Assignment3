package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void CalculatorStub()
	{
		Calculator dim = new Calculator();
		assertNotNull(dim);
		
	}
	
	@Test
	public void getTotalStub()
	{
		Calculator dim = new Calculator();
		assertEquals(dim.getTotal(),0);
		
	}
	
	@Test
	public void addStub()
	{
		Calculator dim = new Calculator();
		dim.add(4);
		assertEquals(dim.getTotal(),4);
		
	}
	
	@Test
	public void subtractStub()
	{
		Calculator dim = new Calculator();
		dim.subtract(3);
		assertEquals(dim.getTotal(),-3);
		
	}
	
	@Test
	public void multiplyStub()
	{
		Calculator dim = new Calculator();
		dim.add(3);
		dim.multiply(3);
		assertEquals(dim.getTotal(),9);
		dim.multiply(0);
		assertEquals(dim.getTotal(),0);
		
	}
	
	@Test
	public void divideStub()
	{
		Calculator dim = new Calculator();
		dim.add(9);
		dim.divide(0);
		assertEquals(dim.getTotal(),0);
		dim.add(9);
		dim.divide(3);
		assertEquals(dim.getTotal(),3);
		
	}
	
	@Test
	public void getHistoryStub()
	{
		Calculator dim = new Calculator();
		assertEquals(dim.getHistory(),"");
		
	}

}

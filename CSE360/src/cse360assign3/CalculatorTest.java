package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void CalculatorStub() //base Case
	{
		Calculator dim = new Calculator();
		assertNotNull(dim);
		
	}
	
	@Test
	public void getTotalStub() //base Case
	{
		Calculator dim = new Calculator();
		assertEquals(dim.getTotal(),0);
		
	}
	
	@Test
	public void addStub() //base Case
	{
		Calculator dim = new Calculator();
		dim.add(4);
		assertEquals(dim.getTotal(),4);
		
	}
	
	@Test
	public void addNegative() //tests negative case
	{
		Calculator dim = new Calculator();
		dim.add(-9);
		assertEquals(dim.getTotal(),-9);
		
	}
	
	@Test
	public void subtractStub() //base Case
	{
		Calculator dim = new Calculator();
		dim.subtract(3);
		assertEquals(dim.getTotal(),-3);
		
	}
	
	@Test
	public void subtractNegative() //tests negative case
	{
		Calculator dim = new Calculator();
		dim.subtract(-3);
		assertEquals(dim.getTotal(),3);
		
	}
	
	@Test
	public void multiplyStub() //base Case
	{
		Calculator dim = new Calculator();
		dim.add(3);
		dim.multiply(3);
		assertEquals(dim.getTotal(),9);
		
	}
	
	@Test
	public void multiplyByZero() //tests zero case
	{
		Calculator dim = new Calculator();
		dim.add(3);
		dim.multiply(0);
		assertEquals(dim.getTotal(),0);
		
	}
	
	@Test
	public void multiplyByNegative() //tests negative case
	{
		Calculator dim = new Calculator();
		dim.add(3);
		dim.multiply(-4);
		assertEquals(dim.getTotal(),-12);
		
	}
	
	@Test
	public void divideStub() //base Case
	{
		Calculator dim = new Calculator();
		dim.add(9);
		dim.divide(3);
		assertEquals(dim.getTotal(),3);
		
	}
	
	@Test
	public void divideByZero() //tests zero case
	{
		Calculator dim = new Calculator();
		dim.add(9);
		dim.divide(0);
		assertEquals(dim.getTotal(),0);
		
	}
	
	@Test
	public void divideByNegative() //tests negative case
	{
		Calculator dim = new Calculator();
		dim.add(9);
		dim.divide(-3);
		assertEquals(dim.getTotal(),-3);
		
	}
	
	@Test
	public void getHistoryStub() //base Case
	{
		Calculator dim = new Calculator();
		assertEquals(dim.getHistory(),"0");
		
	}

	@Test
	public void getHistorySingleTest() //tests single case
	{
		Calculator dim = new Calculator();
		dim.add(3);
		assertEquals(dim.getHistory(),"0 + 3");
		
	}
	
	@Test
	public void getHistoryMultiTest() //tests multiple case
	{
		Calculator dim = new Calculator();
		dim.add(12);
		dim.divide(3);
		dim.multiply(2);
		dim.subtract(5);
		assertEquals(dim.getHistory(),"0 + 12 / 3 * 2 - 5");
		
	}
	
	@Test
	public void getHistoryOmniTest() //tests negative and multiple case
	{
		Calculator dim = new Calculator();
		dim.add(12);
		dim.divide(-3);
		dim.multiply(2);
		dim.subtract(-5);
		assertEquals(dim.getHistory(),"0 + 12 / -3 * 2 - -5");
		
	}
}

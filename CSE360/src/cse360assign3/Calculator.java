/**
 * emulates a calculator
 * 
 * @author Michael O'Loughlin Pin#619
 * @version Jan 26, 2015
 * 
 * 
*/
package cse360assign3;

public class Calculator {
	
	/** creates a variable that keeps track of the total of all operations */
	private int total;
	
	/** keeps track of all calculator class history*/
	private String history;
	
	/** Constructor for every calculator object
	 * 
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** Gets the total of the calculator object
	 * 
	 * @return total 		the total for the calculator object
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds the value to total
	 * 
	 * 
	 */
	public void add (int value) {
		
		history = history + " + " + value;
		total = total + value;
		
	}
	
	/** Subtracts the value from the total
	 * 
	 * 
	 */
	public void subtract (int value) {
		
		history = history + " - " + value;
		total = total - value;
		
	}
	
	/** multiplies the value to the total
	 * 
	 * 
	 */
	public void multiply (int value) {
		
		history = history + " * " + value;
		total = total * value;
		
	}
	
	/** divides the value from the total
	 * 
	 * 
	 */
	public void divide (int value) {
		
		history = history + " / " + value;
		if (value == 0)
		{
			total = 0;
		}
		
		else
			
			total = total / value;
		
	}
	
	/** returns the entire history of the calculator object seriously
	 * 
	 * 
	 */
	public String getHistory () {
		
		return history;
	}

}

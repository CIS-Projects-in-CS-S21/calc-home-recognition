package edu.temple.cis3296;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorModelTest {
	CalculatorModel calc; 

	@Before 
	public void initialize(){
		calc = new CalculatorModel();
	}

	@Test
	public void shouldAddTwoPlusTwo(){
		// Assert 2.0 plus 2.0 is equals 4.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon. 
		assertEquals(5.0, calc.operationAdd(2.0, 3.0), 0.1);
	} 

	@Test
	public void shouldSubstTwoAndTwo(){
		// Assert 3.0 minus 2.0 equals 0.0 plus or minus 0.1 epsilon
		// Assert -1.0 minus -3.0 equals 2.0 plus or minus 0.1 epsilon
		// Using Doubles requires the use of epsilon for roundoff errors
		assertEquals(1.0, calc.operationSubst(3.0, 2.0), 0.1);
		assertEquals(2.0, calc.operationSubst(-1.0, -3.0), 0.1);
	} 

	@Test
	public void shouldMultTwoByOne(){
		assertEquals(2.0, calc.operationMult(4.0, 2.0), 0.1);
	} 

	@Test
	public void shouldDivTwoByOne(){
		assertEquals(2.0, calc.operationDiv(2.0, 1.0), 0.1);
	} 

	


}

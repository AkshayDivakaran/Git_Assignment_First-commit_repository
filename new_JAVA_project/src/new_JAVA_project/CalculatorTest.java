package new_JAVA_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	//Testing Addition
	public void testSum() {
		Calculator calc = new Calculator();
		int sumTest=calc.sum(7,8);
		assertEquals(15,sumTest);
	}

	//Testing Subtraction
	public void testSubtract() {
		Calculator calc = new Calculator();
		int subtractTest=calc.subtract(13,6);
		assertEquals(7,subtractTest);
	}

	//Testing Multiplication
	public void testMultiply() {
		Calculator calc = new Calculator();
		int multiplicationTest = calc.multiply(15,4);
		assertEquals(60,multiplicationTest);
	}

	//Testing Division
	public void testDivision() {
		Calculator calc = new Calculator();
		int divisionTest = calc.division(21,7);
		assertEquals(3,divisionTest);
	}

}

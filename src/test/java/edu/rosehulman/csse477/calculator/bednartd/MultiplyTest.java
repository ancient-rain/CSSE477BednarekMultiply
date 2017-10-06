package edu.rosehulman.csse477.calculator.bednartd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testExecute() {
		Multiply m = new Multiply();
		
		
		double actual = m.execute(null);
		double expected = 0;
		assertEquals(expected, actual, 0.00001);
		
		actual = m.execute(0,1,2);
		expected = 0;
		assertEquals(expected, actual, 0.00001);

		actual = m.execute(1,2,3,4);
		expected = 24;
		assertEquals(expected, actual, 0.00001);

		actual = m.execute(1,2,3,-4);
		expected = -24;
		assertEquals(expected, actual, 0.00001);

		actual = m.execute(1,2,-3,-4);
		expected = 24;
		assertEquals(expected, actual, 0.00001);
	}

}

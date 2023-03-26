package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void testPositive() {
        JunitTesting test = new JunitTesting();
        double output = test.divide(5, 2);
        assertEquals(2.5, output, 0.0001);
    }
    
    @Test
    public void testNegative() {
        JunitTesting test = new JunitTesting();
        try {
            test.divide(10, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }

}


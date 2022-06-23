package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(10, RecursionMath.recursiveDivision(100, 10));
    	assertEquals(123456789, RecursionMath.recursiveDivision(100, 9));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(81, RecursionMath.recursivePower(3, 4));
    	assertEquals(16, RecursionMath.recursivePower(2, 4));
    }
}

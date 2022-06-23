package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 
    	if (times == 1) {
    		return number;
    	}
        // Else return number + recursiveMultiplication(number, times-1)

        return number + recursiveMultiplication(number, times-1);
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    int g = 0;
    public static int recursiveDivision(int number, int numberToDivideBy) {
        if (number%numberToDivideBy != 0) return 123456789;
        
        if (number == 0) {
    		return 0;
    	}
        // Else return number + recursiveMultiplication(number, times-1)

        return 1 + recursiveDivision(number-numberToDivideBy, numberToDivideBy);

        
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
    	if (power == 0) {
    		return 1;
    	}
        // Else return number + recursiveMultiplication(number, times-1)

        return number * recursivePower(number, power-1);
    }
}

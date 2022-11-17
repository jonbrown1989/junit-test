/**
 * A class containing methods
 * to represent a Fibonacci Calculator.
 * @author jon.brown
 */
public class FibonacciCalculator {

    /**
     * Method returns true if given number exists
     * in the Fobonacci sequence or false if it doesn't
     * @param testNumber- number to test
     * @returns boolVar
     */
    public static boolean isFibonacciNumber(int testNumber) {
        int sequentialFirst = 0;
        int sequentialSecond = 1;
        int fibNum = 0;
        Boolean boolVar = Boolean.FALSE;

        while (fibNum < testNumber) {
            fibNum = sequentialFirst + sequentialSecond;
            sequentialFirst = sequentialSecond;
            sequentialSecond = fibNum;
        }

        if (fibNum == testNumber) {
            boolVar = true;
        }
        return boolVar;
    }

    /**
     * Method calculates and returns the Fibonacci number
     * in the nth position (based on given number)
     * of the sequence.
     * @param //fibPosition number denoting position to test
     * @returns boolVar
     */

//    public int getFibonacciNumber(int number) {
//        int sequentialFirst = 0;
//        int sequentialSecond = 1;
//        int fib = 0;
//        while (fib < number) {
//            fib = sequentialFirst + sequentialSecond;
//            sequentialFirst = sequentialSecond;
//            sequentialSecond = fib;
//        }
//        return fib;
//    }


    /**
     * Method returns true if given number exists
     * in the Fibonacci sequence or false if it doesn't
     * @param fibPosition- number to test
     * @returns fib
     */
    public static int getFibonacciNumber(int fibPosition) {
        int sequentialFirst = 0;
        int sequentialSecond = 1;
        int fib = 0;
        fibPosition -= 1; //subtract 1 from fib position to account for 0 position
        int i = 1;
        if (fibPosition == 1) {
            i = 0;
        }
        while (i < fibPosition) {
            fib = sequentialFirst + sequentialSecond;
            sequentialFirst = sequentialSecond;
            sequentialSecond = fib;
            i++;
        }
        return fib;

    }
}

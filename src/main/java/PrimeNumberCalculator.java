import org.apache.commons.lang3.StringUtils;

public class PrimeNumberCalculator {
    /**
     * PrimeNumberCalculator class contains methods for determining
     * primality or the unique prime factorization of a given number
     *
     * @author jon.brown
     */

    /**
     * Method returns true if given number is prime
     * or false if it isn't
     * @param number to test primality
     * @returns boolVar
     */
    public static boolean isPrime(int number) {
        Boolean boolVar = false;

        int primeFlag = 0;
        for(int i = 1; i < number; i++){
            if(number%i == 0) {
                primeFlag += 1;
            }
        }

        if (primeFlag == 1){
            boolVar = true;
        }

        return boolVar;
    }

    /**
     * Method determines the sequence of numbers comprising
     * the given number's unique prime factorization
     * and returns the equation as a string
     * @param number number to test
     */
    public static String getPrimeFactorization(int number) {

        String primeString = "";
        int i = 2;

        while (i <= number) {
            // Checking if 'i' is factor of number
            if (number % i == 0) {
                if (PrimeNumberCalculator.isPrime(i) == Boolean.TRUE) {
                    primeString += i +" * ";
                    number = number / i;
                    i = 2;
                }
            }
            else{
                i++;
            }

        }
        primeString = StringUtils.substring(primeString, 0, primeString.length() - 2);
        return primeString;
    }
}

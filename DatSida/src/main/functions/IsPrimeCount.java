package main.functions;


public class IsPrimeCount {

    public static int primeCount(int start, int end) {

        start = start < 2 ? 2 : start;

        if (end < start) return 0;

        int count = 0;

        if (start % 2 == 0) {
            if (start == 2) count++;
            start++;
        }

        for (int i = start; i <= end; i = i + 2) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }


    public static boolean isPrime(int value) {

        // Check 2,3 is prime
        if (value == 2 || value == 3) return true;

        // If value < 2 or value % 2 is not prime
        if (value < 2) return false;
        if (value % 2 == 0) return false;

        int end = (int) Math.sqrt(value);
        for (int i = 2; i <= end; i++) {
            if (value % i == 0) return false;
        }

        return true;
    }

}




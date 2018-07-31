package main.test;


import main.functions.IsPrimeCount;

import static main.functions.FindPorcupineNumber.findPorcupineNumber;

public class TestFindPorcupineNumber {

    public static void main(String[] args) throws Exception {
        int mm = 19;
        System.out.println("aaaa" + findPorcupineNumber(mm));

        System.out.println("aaaa" + findPorcupineNumber(139));
        System.out.println("aaaa" + findPorcupineNumber(0));
        System.out.println( IsPrimeCount.isPrime( 139 ) );
        System.out.println( IsPrimeCount.isPrime(mm ) );
        System.out.println( IsPrimeCount.isPrime(0 ) );
    }
}

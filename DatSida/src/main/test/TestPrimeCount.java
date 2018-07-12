package main.test;



import main.functions.IsPrimeCount;


import static main.functions.IsPrimeCount.primeCount;



public class TestPrimeCount {

    public static void main(String[] args) throws Exception {

        System.out.println(primeCount(11,29));
        System.out.println(primeCount(10,30));
        System.out.println(IsPrimeCount.isPrime(3));
        System.out.println(IsPrimeCount.isPrime(2));
        System.out.println(IsPrimeCount.isPrime(10));
    }
}




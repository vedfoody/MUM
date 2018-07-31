package main.functions;

import static main.functions.IsPrimeCount.isPrime;

public class FindPorcupineNumber {

    public static int findPorcupineNumber(int n)
    {

        int endOfn = n %10;
        int startChecking = n + (9 - endOfn) ;

        //check if iterator entry is not prime number

        while(isPrime(startChecking) == false  || startChecking == n){
            startChecking += 10 ;
        }

        //start finding next prime here

        int nextPrimeCheck = startChecking + 2;
        while(true){
            if(isPrime(nextPrimeCheck) == false){
                nextPrimeCheck  += 2;
                continue;
            }

            if(nextPrimeCheck % 10 == 9 ){
                return startChecking;
            }else{
                return findPorcupineNumber(nextPrimeCheck);
            }

        }


    }
}

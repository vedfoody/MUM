package main.functions;

public class IsGuthrieIndex {

    public static int guthrieIndex(int n) {

        int countStep = 0;

        while(n!=1){
            if(n%2==0)
                n=n/2;
            else
                n = n*3+ 1;
            countStep ++;
        }
        return countStep;
    }
}

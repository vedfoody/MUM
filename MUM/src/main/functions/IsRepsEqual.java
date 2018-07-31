package main.functions;

public class IsRepsEqual {

   public static int repsEqual(int[ ] a, int n)
   {

        if(a.length == 0) return 0;
       for (int i = a.length -1; i >= 0; i--) {

           if( n == 0)
               return 0;

           int temp = n % 10;
           n = n/10;


           if(a[i] != temp)
               return 0;


       }
      // if(n/10 ==0) return 0;

       return  1;


   }
}

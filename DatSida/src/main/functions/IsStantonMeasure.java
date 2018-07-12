package main.functions;

import java.util.HashMap;
/*For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the
array and 2 occurs 3 times.*/

public class IsStantonMeasure {

    public static int stantonMeasure(int[] a) {
//        {
//            1: 2,
//            4: 1,
//            3:2,
//            2:3,
//        }
//        n = 2


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        //   for(int i=0; i< a.length; i++){
        for (int value : a) {
            if (hashMap.containsKey( value )) {
                Integer countNumber = hashMap.get( value );
                countNumber ++;
                hashMap.put( value, countNumber );// count the number appears, i is value of array,
                // value is the number of times that i appears in the array
            } else
                hashMap.put( value, 1 );
        }
        int n = hashMap.get( 1 );
        int count = hashMap.get( n );
        return count;
    }

}

package main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testForSum {

    public static void main(String[] args) {

       // System.out.println( "Test for sum 3 loops   " + testForSum(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12},22));
       // System.out.println( "Test for sum 3 loops   " + removeLargerNumber(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12},22));
//        System.out.println( "generateSubset  " + generateSubset(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12}));
      //  System.out.println( "findSumInSubset  " + findSumInSubset(generateSubset(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12}), 22));
        System.out.println( "findSumInSubset  " + checkTriplet((new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12}), 100));
    }


    public static boolean findSumInSubset(List<List<Integer>> subSetList, int n){

       // List<List<Integer>> result = new ArrayList<>(  );
        for(int i =0 ; i < subSetList.size(); i ++)
        {
            List<Integer> subSet = subSetList.get( i );
            int sum = 0;
            for (Integer value : subSet) {
                sum += value;
            }
            if( sum == n) {
                System.out.println( Arrays.toString( subSet.toArray( new Integer[0] ) ) );
//                    return true;
            }
        }
        return false;

    }

    public static List<List<Integer>> generateSubset(int[] a){
        List<List<Integer>> result = new ArrayList<>(  );
        int n = a.length;

        // 1 << n : shift left binary = move to left binary 2^n
        for(int i = 0; i < (( 1 << n )) ; i++){
            int shifted = 1 << n;
          //  System.out.println( shifted );
            List<Integer> subSet = new ArrayList<>(  );
            for(int j = 0; j < n ; j++) {
                if ((i & (1 << j)) > 0) {
                    subSet.add( a[j] );
                }
            }
            result.add( subSet );
        }

        return result;
    }



    public static boolean testForSum(int[] a, int n) {

        for (int i : a) {
            for (int j : a) {
                for (int k : a) {
                    if( i != j && j!= k && i !=k ){
                        int sum = i+ j + k;
                        if(sum == n)
                            return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean removeLargerNumber(int[] a, int n) {

        int sum;
        int[] b = new int[a.length];
           for(int i =0; i < a.length; i++ ){
               int ai = a[i];
               if( ai < n)
               {
                   b[i] = ai;
               }
            System.out.println( Arrays.toString(b) );
           }
        return  testForSum(b,n);
    }


    public static boolean checkTriplet(int []a, int n){

        Arrays.sort(a, 0, a.length);

        int sum = 0;
        int left = 0;
        int right = a.length - 1;

        for(int i = 0; i < a.length - 2; i++){
            left = i + 1;
            right = a.length - 1 - i;

            while (left < right) {
                if (n - a[i] == a[left] + a[right]) {
                    return true;
                } else if (n - a[i] < a[left] + a[right]) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return false;
    }


    }

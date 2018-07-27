package main.test;

import java.util.Arrays;

public class oddCenter {


    public static void main(String[] args) {

//        System.out.println(" oddCenter " + oddCenter(new int[]{5, 4, 4, 2, 2}));
//        System.out.println("odd Center is 1 :  " + oddCenter(new int[]{3, 2, 1, 4, 5}));
//        System.out.println(" oddCenter " + oddCenter(new int[]{3, 2, 1, 4, 1}));
//        System.out.println("odd Center is 1 :  " + oddCenter(new int[]{1, 2, 3, 4}));
//        System.out.println("odd Center is 1 :  " + oddCenter(new int[]{10}));
//        System.out.println("odd Center is 1 :  " + oddCenter(new int[]{1}));
//
//        //=========================================================================
//
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{1}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{1, 2}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{1, 2, 3}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{1, 2, 3, 4}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{3, 3, 4, 4}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{4, 1, 2, 3}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{1, 1}));
//        System.out.println(" sumOddEvenNumber " + sumOddEvenNumber(new int[]{}));
//
//
//        System.out.println(" subChars is  " + subChars(new char[]{'a', 'b', 'c'}, 1, 3));
//
//        System.out.println(" subChars is  " + subChars(new char[]{'a', 'b', 'c'}, 4, 2));
//        System.out.println(" subChars is  " + subChars(new char[]{'a', 'b', 'c'}, 1, 4));
//        System.out.println(" subChars is  " + subChars(new char[]{}, 0, 1));
        System.out.println(" subChars is  " + subChars(new char[]{'a', 'b', 'c'}, 1, 2));
//        System.out.println(" subChars is  " + reverseInteger(91234));
//        System.out.println(" subChars is  " + reverseInteger(-1234));
//        System.out.println(" subChars is  " + reverseInteger(0));
//        System.out.println(" subChars is  " + reverseInteger(86377));

        int[] first = new int[]{1, 2};
        int[] second = new int[]{};

  //      System.out.println("commonValue is 1 :  " + commonValueInter(first, second));
    }

    public static int oddCenter(int[] arrays) {


        if (arrays == null || arrays.length % 2 == 0) return 0;

        int midIndex = arrays.length / 2;
        int midValue = arrays[midIndex];

        for (int i = 0; i < arrays.length; i++) {
            if (midValue >= arrays[i] && i != midIndex) {
                return 0;
            }

        }

        return 1;

    }


    public static int sumOddEvenNumber(int[] arrays) {

        if (arrays == null) return 0;


        int X = 0; // the sum of the odd numbers in the array
        int Y = 0; // the sum of the even numbers in the array

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                X += arrays[i];
            } else {
                Y += arrays[i];
            }
        }
        return X - Y;
    }


    public static String subChars(char[] arr, int start, int len) {

        int subLength = start + len - 1;
        if (start < 0 || len < 0 || subLength >= arr.length) {
            return null;
        }

        char[] subArray = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
            subArray[j] = arr[i];
            System.out.println(subArray[j]);

        }

        //return Arrays.toString(subArray);
        return String.valueOf(subArray);
    }

    public static int reverseInteger(int n) {


        int sign = 1;

        int reverseValue = 0;

        if (n == 0) return 0;

        if (n < 0) {
            sign = -1;
            n = -n; // n = n/10
        }

        while (n != 0) {
            reverseValue = (reverseValue * 10) + n % 10;
            n /= 10;
        }

        return sign * reverseValue;
    }
}
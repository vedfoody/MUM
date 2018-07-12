package main.test;

import java.util.ArrayList;
import java.util.List;

public class IsRecursive {
    public static void main(String[] args) {

        // System.out.println( "Test for sum 3 loops   " + testForSum(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12},22));
        // System.out.println( "Test for sum 3 loops   " + removeLargerNumber(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12},22));
//        System.out.println( "generateSubset  " + generateSubset(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12}));
        //  System.out.println( "findSumInSubset  " + findSumInSubset(generateSubset(new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12}), 22));
        System.out.println( "findSumInSubset  " + isRecursive((new int[] {1,2,3,4,5} )).size());
    }


    public static List<String> isRecursive(int a[]){
        StringBuilder s = new StringBuilder();

        for (int value:a) {
            s.append(value);
        }

        String data =s.toString();

        List<String> result = new ArrayList<>();

        permute(data, 0, data.length()-1, result);

        return result;
    }



    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private static void permute(String str, int l, int r, List<String> result)
    {
        if (l == r)
            result.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, result);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

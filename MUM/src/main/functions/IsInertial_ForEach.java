package main.functions;

/*An array is defined to be inertial if the following conditions hold:
        a. it contains at least one odd value
        b. the maximum value in the array is even
        c. every odd value is greater than every even value that is not the maximum value.
        So {11, 4, 20, 9, 2, 8} is inertial because
        a. it contains at least one odd value
        b. the maximum value in the array is 20 which is even
        c. the two odd values (11 and 9) are greater than all the
        even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
        However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is
        even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
        Write a function called isIntertial that accepts an integer array and returns 1 if the array is
        inertial; otherwise it returns 0.
        If you are programming in Java or C#, the function signature is
        int isInertial(int[ ] a
        If you are programming in C or C++, the function signature is
        int isInertial(int a[ ], int len) where len is the number of elements in the array */



//làm đơn giản theo cách của chị thì add odd number vào list thay vì array
//        vậy là xong rồi
//        còn ko thì khỏi cần list hay array
//        hết vòng lặp đầu tìm maxEven với secondMaxEven thì lặp lại cái array ban đầu
//        nếu chẵn thì loại
//        nhớ thêm cái flag để check có ít nhất 1 odd number nữa
//        mà chị làm là mặc định các số >= 0 hết à :v

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IsInertial_ForEach {


    public static int IsInertial(int[] a) {

        int maxEven = Integer.MIN_VALUE;
        int secondMaxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        boolean hasOddValue = false;
        boolean hasEvenValue = false;

        List<int[]> li = Arrays.asList( a );
       Iterator<int[]> iter = Arrays.asList( a ).iterator();
       while (iter.hasNext()) {
           iter.next();
       }

       for (int[] b : li) {

       }

        for(int value : a){
            if(value%2 == 0){
                hasEvenValue = true;
                if(value> maxEven){
                   secondMaxEven = maxEven;
                   maxEven = value;
                }else if( value < maxEven && value > secondMaxEven)
                {
                    secondMaxEven = value;
                }
            }else {
                hasOddValue = true;
                if( value < minOdd){
                    minOdd = value;
                }else
                {
                    maxOdd = value;
                }
            }

        }

    return hasOddValue && minOdd > secondMaxEven && maxOdd < maxEven ? 1 : 0;


    }
}

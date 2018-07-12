package main.functions;

public class IsMartian {


    static int isMartian(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int one_counter = 0;
        int two_counter = 0;

        if (arr[0] == 1) {
            one_counter++;
        } else if (arr[0] == 2) {
            two_counter++;
        }

        // loop from 1 -> a.length  . So that We can check "two adjacent elements are equal"
        // besides, count 1s and 2s.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) return 0;

            if (arr[i] == 1) {
                one_counter++;
            } else if (arr[i] == 2) {
                two_counter++;
            }
        }

        return one_counter > two_counter ? 1 : 0;
    }

}

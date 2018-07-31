

public class Main {
    public static void main(String[] args) throws Exception {
 System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 3, 2, 3, 2, 1, 3, 1, 2}));

//        System.out.println(primeCount(10, 30));
//        System.out.println(primeCount(11, 29));
//        System.out.println(primeCount(-10, 6));
//
//        System.out.println(isMadhavArray(new int[] {2, 1, 1}));
//        System.out.println(isMadhavArray(new int[] {2, 1, 1, 4, -1, -1}));
//        System.out.println(isMadhavArray(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
//        System.out.println(isMadhavArray(new int[] {18, 9, 10, 6, 6, 6}));
//        System.out.println(isMadhavArray(new int[] {3, 1, 2, 3, 0}));

        ///

        int[] a1 = {11, 4, 20, 9, 2, 8};

        System.out.println(isInertial(a1));
    }

    private static int isMartian(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int one_counter = 0;
        int two_counter = 0;

        if (arr[0] == 1) {
            one_counter++;
        } else if (arr[0] == 2) {
            two_counter++;
        }

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

    private static boolean isPrime(int value) {
        if (value < 2) return false;
        if (value == 2 || value == 3) return true;
        if (value % 2 == 0) return false;

        int end = (int) Math.sqrt(value);
        for (int i = 2; i <= end; i++) {
            if (value % i == 0) return false;
        }

        return true;
    }

    private static int primeCount(int start, int end) {
        start = start < 2 ? 2 : start;

        if (end < start) return 0;

        int count = 0;

        if (start % 2 == 0) {
            if (start == 2) count++;
            start++;
        }

        for (int i = start; i <= end; i = i + 2) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static int isMadhavArray(int[] arr) {
        if (arr == null || arr.length < 3) return 0;

        int c = 2;
        int start = 1;
        while (start < arr.length) {
            int end = start + c - 1;

            if (end >= arr.length) return 0; // length is invalid

            int sum = 0;
            for (int j = start; j <= end; j++) {
                sum += arr[j];
            }

            if (sum != arr[0]) return 0;

            start = end + 1;
            c++;
        }

        return 1;
    }


    private static int isInertial(int[] a) {


        return 1;


    }

}

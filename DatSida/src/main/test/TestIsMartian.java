package main.functions;


import static main.functions.IsMartian.*;


public class TestIsMartian {


    public static void main(String[] args) throws Exception {

        int[] a1 = {1, 3};
        int[] a2 = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int[] a3 = {1, 3, 2};
        int[] a4 = {1, 3, 2, 2, 1, 5, 1, 5};
        int[] a5 = {1, 2, -18, -18, 1, 2};
        int[] a6 = {};
        int[] a7 = {1};
        int[] a8 = {2};

        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 3, 2, 3, 2, 1, 3, 1, 2}));
        System.out.println("Array is Martian if it is  " + " "+  isMartian(a1));
        System.out.println("Array is Martian if it is  " + isMartian(a2));
        System.out.println("Array is Martian if it is  " + isMartian(a3));
        System.out.println("Array is Martian if it is  " + isMartian(a4));
        System.out.println("Array is Martian if it is  " + isMartian(a5));
        System.out.println("Array is Martian if it is  " + isMartian(a6));
        System.out.println("Array is Martian if it is  " + isMartian(a7));
        System.out.println("Array is Martian if it is  " + isMartian(a8));


    }
}
package main.test;

import main.functions.IsInertial;

import static main.functions.IsInertial.*;

public class TestInertial {


    public static void main(String[] args) throws Exception {


        System.out.println(IsInertial(new int[] {11, 4, 20, 9, 2, 8}));  // 1
        System.out.println(IsInertial(new int[] {12, 11, 4, 9, 2, 3, 10}));  // 0
        System.out.println(IsInertial(new int[] {1}));  // 0
        System.out.println(IsInertial(new int[] {2}));  // 0
        System.out.println(IsInertial(new int[] {1, 2, 3, 4}));  // 0
        System.out.println(IsInertial(new int[] {1, 1, 1, 1, 1, 1, 2}));  // 1
        System.out.println(IsInertial(new int[] {2, 12, 4, 6, 8, 11}));  // 1
        System.out.println(IsInertial(new int[] {2, 12, 12, 4, 6, 8, 11}));  // 1
        System.out.println(IsInertial(new int[] {-2, -4, -6, -8, -11}));  // 0
        System.out.println(IsInertial(new int[] {2, 3, 5, 7}));  // 0
        System.out.println(IsInertial(new int[] {2, 4, 6, 8, 10}));  // 0

    }
}
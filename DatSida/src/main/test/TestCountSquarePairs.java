package main.test;

import main.functions.countSquarePairs.*;

import static main.functions.countSquarePairs.CountSquarePairs;

public class TestCountSquarePairs {

    public static void main(String[] args) {
        System.out.println(CountSquarePairs(new int[] {11, 5, 4, 20}));
        System.out.println(CountSquarePairs(new int[] {2, 7, 2, 2}));
        System.out.println(CountSquarePairs(new int[] {9, 0, 2, -5, 7}));
        System.out.println(CountSquarePairs(new int[] {9}));
        System.out.println(CountSquarePairs(new int[] {2, 7, 0, 1, 5, 1}));
    }


}

package main.test;

import main.functions.IsStantonMeasure;
import org.junit.jupiter.api.Test;



public class IsStantonMeasureTest {

    @Test
    public void stantonMeasure() {

        System.out.println( "stantonMeasure " + IsStantonMeasure.stantonMeasure(new int[] {7,  22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
        System.out.println( "stantonMeasure " + IsStantonMeasure.stantonMeasure(new int[] {8, 1,1,1,17, 4,4, 1}));
        System.out.println( "stantonMeasure " + IsStantonMeasure.stantonMeasure(new int[] {8, 2,1,4,2,2,2, 1}));
        System.out.println( "stantonMeasure " + IsStantonMeasure.stantonMeasure(new int[] {8, 4, 2, 1}));
    }
}
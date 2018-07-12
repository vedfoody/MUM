package main.test;


import main.functions.IsRepsEqual;
import org.junit.jupiter.api.Test;

public class IsRepsEqualTest {

    @Test
    public void repsEqual() {

       System.out.println( "repsEqual   " + IsRepsEqual.repsEqual(new int[] {3, 2, 0, 5, 3},32053));
      System.out.println( "repsEqual  " + IsRepsEqual.repsEqual(new int[] {},22));
        System.out.println( "repsEqual  " + IsRepsEqual.repsEqual(new int[] {2},22));
    }
}
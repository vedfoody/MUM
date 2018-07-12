package main.functions;



public class IsGuthrieSequenceTest {


    public static void main(String[] args) {


        System.out.println( "IsGuthrieSequence " + IsGuthrieSequence.isGuthrieSequence(new int[] {7,  22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
        System.out.println( "IsGuthrieSequence " + IsGuthrieSequence.isGuthrieSequence(new int[] {8, 17, 4, 1}));
        System.out.println( "IsGuthrieSequence " + IsGuthrieSequence.isGuthrieSequence(new int[] {8, 4, 1}));
        System.out.println( "IsGuthrieSequence " + IsGuthrieSequence.isGuthrieSequence(new int[] {8, 4, 2, 1}));


    }
}
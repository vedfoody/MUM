package main.test;

import java.util.*;
import java.util.stream.IntStream;

public class removeDuplicates {
    public static void main(String[] args) {
        List<String> input2 = new ArrayList<>();

        IntStream.range( 0, 100000 ) //100000
                .forEach( count -> {
                    input2.add("good");
                    input2.add("better");
                    input2.add("best");
                    input2.add("best");
                    input2.add("first");
                    input2.add("last");
                    input2.add("last");
                    input2.add("last");
                    input2.add("good");
                } );
        String[] input = input2.toArray( new String[input2.size()] );
        System.out.println( "Input: " + Arrays.toString( input ));

        long startLoop = System.currentTimeMillis();
        List<String> loopResult = removeUsingLoops(Arrays.asList( input ));
        long endLoop = System.currentTimeMillis();
        System.out.println( "Using loop result: " + Arrays.toString( loopResult.toArray() ));
        System.out.println( "Using loop took: " + String.valueOf( endLoop - startLoop ));

//        long startList = System.currentTimeMillis();
//        List<String> tempListResult = removeUsingTemporyList(Arrays.asList( input ));
//        long endList = System.currentTimeMillis();
//        System.out.println( "Using list result: " + Arrays.toString( tempListResult.toArray() ));
//        System.out.println( "Using list took: " + String.valueOf( endList - startList ));

//        long startMap = System.currentTimeMillis();
//        List<String> tempMapResult = removeUsingMap(Arrays.asList( input ));
//        long endMap = System.currentTimeMillis();
//        System.out.println( "Using map result: " + Arrays.toString( tempMapResult.toArray() ));
//        System.out.println( "Using map took: " + String.valueOf( endMap - startMap ));
    }

    public static List<String> removeUsingLoops(List<String> input) {
        List<String>  output = new ArrayList<>();

        for (String value : input) {
            if (output.isEmpty()) {
                output.add( value );
            } else {
                boolean foundDup = false;

                for (String savedValue : output) {
                    if(value.equals(savedValue)) {
                        foundDup = true;
                        break;
                    }
                }

                if (!foundDup) {
                    output.add( value );
                }
            }
        }

       return output;
    }

    public static List<String> removeUsingTemporyList(List<String> input){
        List<String> output = new ArrayList<>();

        for (String value : input) {
            if(output.isEmpty())
            {
                output.add( value );
            } else {
                if (!output.contains( value ))
                {
                    output.add( value );
                }
            }
        }

        return output;
    }


    public static List<String> removeUsingMap(List<String> input){

        Map<String, String> temp = new HashMap<>();

        for (String value : input) {
            if(temp.isEmpty())
            {
                temp.put( value, value );
            } else {
                if (!temp.containsKey( value )) {
                    temp.put( value, value );
                }
            }
        }

        return new ArrayList<>( temp.values() );
    }
}

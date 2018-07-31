package main.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class testSampleDirectEntry {


    public static void main(String[] args){

        // Initial List as Array LIst
        List<String> input2 = new ArrayList<>();

        IntStream.range(1, 100).forEach(count -> {
                input2.add("test");
                input2.add("good");
                input2.add("better");
                input2.add("best");
                input2.add("first");
                input2.add("last");
                input2.add("first");
                input2.add("test");
        });


        System.out.println( "Output: " + removeDuplicateFor(input2));

        List<String> input22 = new ArrayList<>(10);
            input22.add("test");
            input22.add("good");
            input22.add("better");
            input22.add("best");
            input22.add("first");
            input22.add("last");
            input22.add("first");
            input22.add("test2");
            input22.add("last2");
            input22.add("best");
            input22.add("first");


        System.out.println( "Output 22: " + removeDuplicateMap(input22));


    }

        public static List<String> removeDuplicateFor(List<String> input){

            List<String> output = new ArrayList<>();

            for(String value : input){
                if(output.isEmpty())
                {
                    output.add(value);
                }else {

                    boolean foundDup = false;
                    for(String savedValue : output){
                        if(savedValue.equals(value)){
                            foundDup = true;
                            break;
                        }
                    }
                    if(!foundDup) {
                        output.add(value);
                    }
                }
            }

            return  output;

        }


        public static List<String>  removeDuplicateMap(List<String> input){

            Map<String, String> hash = new HashMap<>();

           // List<String> result= new ArrayList<>();

            for(String value : input){
                if(hash.isEmpty())
                {
                    hash.put(value, value );
                }else {
                    if(!hash.containsKey(value)){
                        hash.put(value,value);
                    }
                }
            }

            return new ArrayList<>(hash.values());
        }


}

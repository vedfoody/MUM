package main.test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class commonValueArray {


    public static void main(String[] arrs){



        ArrayList<Integer> first = new ArrayList<>(6);
        first.add(4);
        first.add(7);
        first.add(3);
        first.add(9);
        first.add(2);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(null);
        second.add(4);
        second.add(7);
        second.add(33);
        second.add(93);
        second.add(2);
        second.add(1);
        second.add(12);
        ArrayList<Integer> three = new ArrayList<>(0);

        long startLoop = System.currentTimeMillis();
        System.out.println("test " + addDuplicataUsingMap(first,second));
        long endLoop = System.currentTimeMillis();

       System.out.println("test " + addDuplicataUsingMap(null,second));
        System.out.println("test " + addDuplicataUsingMap(first,three));
    }





    public static ArrayList<Integer> addDuplicataUsingMap(ArrayList<Integer> first, ArrayList<Integer> second){

        if (first == null || second == null){
            return null;
        }

        Map<Integer, Integer> hash = new HashMap<>();
        List<Integer> result= new ArrayList<>();

        for (Integer value : first)
        {
            hash.put(value,value);
        }

        for(Integer value : second){
            if (hash.get(value) != null){
                result.add(value);
            }
        }

        return (ArrayList<Integer>) result;
    }


}



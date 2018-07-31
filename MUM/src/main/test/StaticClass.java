package main.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StaticClass {
    private static List<StaticClass> list = new ArrayList<>(  );

    public static void main(String[] args) {
        IntStream.range( 0, 7 ).forEach( count -> createInstance() );
    }

    public static StaticClass createInstance() {
        if (list.size() <= 5) {
            StaticClass result = new StaticClass();
            list.add( result );

            return result;
        } else {
            throw new IllegalStateException( "Maxium is 5" );
        }
    }
}

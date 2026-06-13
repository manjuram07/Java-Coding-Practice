package com.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortAList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("manju", "raam", "krishna", "hanuman"));
        List<String> list2 = new ArrayList<String>(List.of("raj", "guru", "vidya", "pari"));

        list.sort(new Comparator<String>() {

            @Override
            public int compare(String i, String j) {

                return i.compareTo(j);
            }
        });

        System.out.println(list);


        // using streams
        Stream<String> sorted = list2.stream().sorted(Comparator.naturalOrder());

        sorted.forEach((i) -> System.out.print(i + " "));
    }

}

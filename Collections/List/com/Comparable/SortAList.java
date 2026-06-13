package com.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Stream;

public class SortAList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 1, 9, 3, 7, 6, 2, 8, 4);


        // sort using Comparable
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        list.forEach(i -> System.out.print(i + " "));

        System.out.println();

        // using streams
        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach((i) -> System.out.print(i + " "));
        ;
        //System.out.println(sorted.toList());
        //sorted.forEach((i) -> System.out.print(i+" "));


    }

}

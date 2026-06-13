package com.ArrayList;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        // adding elements in a single line
        List<Integer> list = Arrays.asList(10, 50, 90, 20, 70, 30, 80, 60);
        List<String> list2 = List.of("A", "B", "C", "D");

        System.out.println(list instanceof ArrayList<Integer>);
        System.out.println(list2 instanceof ArrayList<String>);

        System.out.println("Original Elements " + list);
        Set<Integer> set = new HashSet(list);
        System.out.println("Remove Duplicates " + set);

        list.set(0, 100);
        System.out.println(list);

        int max = list.get(0);
        for (int ele : list) {
            if (max < ele) {
                max = ele;
            }
            System.out.println("Maximum element " + max);

            // convert from arraylist to array
            Integer[] array = list.toArray(new Integer[0]);
            System.out.println(Arrays.toString(array));

            // converting array to list
            List<Integer> asList = Arrays.asList(array);
            System.out.println(asList);

            // check if element(value) exists in ArrayList
            if (asList.contains(10)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            List<Integer> sortArray = new ArrayList<>(asList);
            Collections.sort(sortArray);
            System.out.println(asList);

            // using comparator : Comparator using custom sorting order present in java.util
            Collections.sort(asList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    // return o1.compareTo(o2);
                    if (o1 > o2) {
                        return 1;
                    } else if (o2 > o1) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
            System.out.println("Comparator using custom sorting order  : " + asList);

            // comparable with lambda expression : Comparable using default natural sorting, present in java.lang
            Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
            System.out.println("Comparable using default natural sorting  " + list);

        }
    }
}

package com.Linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 1, 5, 6, 7, 8, 5));

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Set<Integer> set = new HashSet<>();
        for (Integer val : list) {
            set.add(val);
        }
        System.out.println("\n" + set);


        ArrayList<Integer> al = new ArrayList<>(List.of(1, 2, 3, 4, 1, 5, 6, 7, 8, 5));

        LinkedList<Integer> ll = new LinkedList<>();

        for (Integer i : al) {
            ll.add(i);
        }
        System.out.println(ll);

        // converting ArrayList to LinkedList using streams
        LinkedList<Integer> collect = al.stream().collect(Collectors.toCollection(LinkedList::new));

        List<Integer> list2 = al.stream().toList();

        System.out.println(collect instanceof LinkedList<Integer>);

        System.out.println(list2 instanceof LinkedList<Integer>);

        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 3, 4, 1, 5, 6, 7, 8, 5));

        Object[] array = list1.toArray();
        System.out.println(Arrays.toString(array));

    }
}

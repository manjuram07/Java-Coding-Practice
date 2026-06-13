package com.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateList {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9);

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println("");
        for (Integer i : l) {
            System.out.print(i + " ");
        }
        System.out.println("");

        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");

        l.stream().forEach((i1) -> System.out.print(i1 + " "));

        System.out.println("");

        ListIterator<Integer> li = l.listIterator(l.size() - 4);
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }

    }
}
	

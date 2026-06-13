package com.Theory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyEachWord {

    public static void main(String[] args) {

        List<String> names = List.of("apple", "banana", "apple", "orange", "banana", "apple");

//        Map<String, Integer> map = new HashMap<>();
//
//        for (String name : names){
//            map.put(name, map.getOrDefault(name, 0)+1);
//        }
//
//        for (Map.Entry<String, Integer> freq : map.entrySet()) {
//            System.out.println(freq);
//        }


        Map<String, Long> freq = names.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(freq);
    }
}

package com.Theory;

import java.util.Scanner;

public class StringObjectsCreationHeapandSCPool {


    static {
        Scanner sc = new Scanner(System.in);
        String A = "alabama";
        String B= "java";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // char ch = ;

        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0))+" "+ B.replace(B.charAt(0), B.toUpperCase().charAt(0)));

    }
    public static void main(String[] args) {

        String s1 = new String("Sprint");  // creates two objects, one in heap and another in SCP
        s1.concat("Fall");  // creates a new object in heap, s1 still refers to the old object

        String s2 = s1.concat("Winter");  // creates a new object in heap, s2 refers to it, s1 still refers to the old object
        s2.concat("Summer");  // creates a new object in heap, s2 still refers to the old object

            System.out.println(s1);  // Sprint
            System.out.println(s2);  // SprintWinter
    }

}

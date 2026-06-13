package com.UnCheckedException;


public class Demo1 {

    public static void main(String[] args) {
        System.out.println(methodA());
    }

    private static StringBuilder methodA() {
        StringBuilder sb = new StringBuilder("A");
        try {
            return sb.append("This is me");   // reference to sb is prepared for return
        } finally {
            return sb.append("B");  // modifies the SAME object
        }

    }

}

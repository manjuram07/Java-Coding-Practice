package Junit_Class.Junit_Class;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        String name = "interview";
        char[] chars = name.toCharArray();

        int left =0;
        int right = name.length()-1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        name = new String(chars);
        System.out.println(name);

    }
}
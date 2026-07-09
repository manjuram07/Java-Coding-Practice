package Array_Data_Structures.com.easy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        maximumProfit();
        leadingZeros();
        majorityElement();
    }

    private static void majorityElement() {
        int[] nums = {3,2,3,1,2,1,2,3,4,3};
        int n = nums.length;
        int count=0, value=0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if (map.get(nums[i]) > count){
                count = map.get(nums[i]);
                value = nums[i];
            }
        }
        System.out.println(value);
    }

    // Move all zeros to the end of the array
    private static void leadingZeros() {
        int[] arr = {1,0,1,1,0,1,0};

        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for (int num : arr){
            System.out.print(num+" ");
        }
    }
    // Maximum Profit Problem
    private static void maximumProfit() {
        int[] prices = {7,2,5,3,1,6,4};
        int days = prices.length;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int day=1; day<days; day++){
            int profit = prices[day]-minPrice;

            if (profit > maxProfit)
                maxProfit = profit;

            if (minPrice > prices[day])
                minPrice = prices[day];
        }

        System.out.println(maxProfit);
    }
}

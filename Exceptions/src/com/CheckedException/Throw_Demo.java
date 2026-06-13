package com.CheckedException;

import java.util.HashMap;
import java.util.Map;


public class Throw_Demo {

	public static void main(String[] args) throws Exception {
		int arr[] = { 10, 5, 15, 10, 5, 10,10,15 };
		int n = arr.length;
		// int count;

//		boolean[] visited = new boolean[n];
//		int maxCount=0, minCount=n;
//		int maxFreqEle=0, minFreqEle=0;
//		
//		for(int i=0; i<n; i++) {
//			count=1;
//			if(visited[i] == true) continue;
//			
//			for(int j=i+1 ; j<n; j++) {
//				if(arr[i] == arr[j]) {
//					count++;
//					visited[j]=true;
//				}
//			}
//			
//			if(count>maxCount) {
//				maxFreqEle = arr[i];
//				maxCount=count;
//			}
//			if(count<minCount) {
//				minFreqEle= arr[i];
//				minCount=count;
//			}
//		}
//		
//		System.out.println("Maximum frequency: "+maxCount);
//		System.out.println("Minimum frequency: "+minCount);
//		
//		
//		System.out.println("Maximum frequency Element: "+maxFreqEle);
//		System.out.println("Minimum frequency Element: "+minFreqEle);

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		int maxFrq = 0, minFrq = n;
		int maxEle = 0, minEle = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			int count = entry.getValue();
			int element = entry.getKey();

			if (count > maxFrq) {
				maxFrq = count;
				maxEle = element;
			}
			if (count < minFrq) {
				minFrq = count;
				minEle = element;
			}
		}

		System.out.println("Maximum frequency Element: " + maxEle+" which is: "+maxFrq);
		System.out.println("Minimum frequency Element: " + minEle+" which is: "+minFrq);

	}

}

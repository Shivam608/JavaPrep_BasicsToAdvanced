package Shared_Shouvik;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = {20,58,45,89,65,75,21,23,88};
		int n = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int num=21;
		int low=0;
		int high = n-1;
		int mid;
		int index = -1;
		System.out.println();
		while(low<=high)
		{
			mid = (low+high)/2;
			if(num==arr[mid])
			{
				index=mid;
				break;
			}
			else if (num<arr[mid])
			{
				high=mid-1;
			}
			else if (num>arr[mid])
			{
				low = mid+1;
			}
			
		}
		if(index==-1)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println("Number found at : " + index + "index");
		}*/

		///  @Question: Write a Java program to implement binary search on an integer array.
		/**
		 * @Example:-
		 * You are given an unsorted array of integers.
		 * int[] arr = {20, 58, 45, 89, 65, 75, 21, 23, 88};
		 * First, sort the array in ascending order.
		 * Print the sorted array.
		 * Search for a given number (e.g., 21) in the array using the binary search algorithm.
		 * If the number is found, print the index where it is located. Otherwise, print "Number not found".
		 */

		int[] arr = {20, 58, 45, 89, 65, 75, 21, 23, 88};


		//Sort in Ascending order
		Arrays.sort(arr);

		//For Sorting in Descending Order using Collection.reverseOrder() method
		/*
		Integer[] arr_ = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr_[i] = arr[i];
		}
		Arrays.sort(arr_, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr_));*/


		// Manual Reverse Order Bad Way  (Time Complexity 0(n)
		/*StringBuilder b = new StringBuilder();
		for (int i = arr.length-1; i >= 0 ; i--) {
			b.append(arr[i]).append(", ");
		}

		String[] a = String.valueOf(b).split(", ");
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = Integer.parseInt(a[i]);
		}
		System.out.println(Arrays.toString(c));*/

		//Manually reverse an Array. (Time Complexity 0(1)
		/*int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 -i];
		}

		/// OR

		int[] x = new int[arr.length];
				for (int i = arr.length-1; i >= 0; i--) {
					x[arr.length-1-i] = arr[i];
				}
		System.out.println(Arrays.toString(newArr));*/



	}

}

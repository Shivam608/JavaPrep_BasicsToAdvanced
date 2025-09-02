package Shared_Shouvik;

import java.util.Arrays;

public class Capg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: 
		//int arr1[] = {1,3,5,7,9}
		//int arr2[] = {2,4,6,8,10}
		
		//Output:
		//Merge both the arrays
		//Find the second highest and second lowest
		//Print the sum of second highest and second lowest
		
		/*int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		int lenght1 = arr1.length;
		int lenght2 = arr2.length;
		
		int length3 = lenght1+lenght2;
		int sum[] = new int[length3];
		
		for(int i=0;i<arr1.length;i++)
		{
			sum[i] =  arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			sum[lenght1+i] =  arr2[i];
		}
		
		Arrays.sort(sum);
		
		System.out.println("Merged array is : ");
		
		for(int i=0;i<sum.length;i++)
		{
			
			System.out.print(sum[i]);
			System.out.print(" ");
		}
		
		System.out.println(" ");
		
		int secondHigh = sum[length3-2];
		int secondLow = sum[1];
		System.out.println("Second Highest : " + secondHigh);
		System.out.println("Second Lowest : " + secondLow);
		System.out.println("Sum : " + (secondHigh+secondLow));*/

		int[] arr_1 = {1,3,5,7,9};
		int[] arr_2 = {2,4,6,8,10};

		int[] _newArr = new int[arr_1.length + arr_2.length];

		for (int i = 0; i < arr_1.length; i++) {
			_newArr[i] = arr_1[i];
		}

		System.out.println(Arrays.toString(_newArr));


		for (int i = 0; i < arr_2.length; i++) {
			_newArr[arr_2.length + i] = arr_2[i];
		}

		System.out.println(Arrays.toString(_newArr));

		Arrays.sort(_newArr);

		int secondLowest = _newArr[2];
		int secondHighest = _newArr[_newArr.length-2];

		System.out.println("Second Highest: " + secondHighest);
		System.out.println("Second Lowest: " + secondLowest);

		System.out.println("Sum of Second Lowest and Highest: " + secondHighest+secondLowest);



		
		

	}

}

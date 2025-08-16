package LeetCode.Arrays;

import java.util.Arrays;

public class LargestMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {5,6,7,9};
//		Arrays.sort(a);
//		
//		//1+2+4+5=12 sum1
//		//1+2+3+4+5=15 sum2
//		//sum2-sum1=3
//		
//		int sum1 =0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum1=sum1+a[i];
//		}
//		
//		System.out.println("Sum of elements of array= " + sum1);
//		
//		int sum2=0;
//		for(int i=5;i<=9;i++)
//		{
//			sum2=sum2+i;
//		}
//		
//		System.out.println("Sum of range of array= " + sum2);
//		System.out.println("Missing number= " + (sum2-sum1));
		
		int[] arr = {2,8,10,4,5,11,12,13};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int largestMissing = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] - arr[i - 1] > 1) {
            	largestMissing = arr[i] - 1;
                break;
            }
        }
        
        if (largestMissing == -1 && arr[0] != 1) {
            largestMissing = arr[0] - 1;
        }
        
        if (largestMissing != -1) {
            System.out.println("The largest missing number is: " + largestMissing);
        } else {
            System.out.println("There is no missing number in the array.");
        }
		
		

	}

}

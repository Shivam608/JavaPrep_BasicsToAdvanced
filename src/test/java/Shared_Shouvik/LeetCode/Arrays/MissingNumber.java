package LeetCode.Arrays;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,7,0,1};
		Arrays.sort(nums);
		int sum=0;
		int sumRange=0;
		int highRange = nums.length;
		int lowRange = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum= sum+nums[i];
		}
		
		for(int i=lowRange;i<=highRange;i++)
		{
			sumRange = sumRange+i;
		}
		System.out.println("Missing number is " + (sumRange - sum));

	}

}

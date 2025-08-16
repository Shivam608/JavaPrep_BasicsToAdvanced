package LeetCode.Arrays;

public class MinimumOperationsToMakeAllElementDivisibleByThree {
	
//	You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//
//	Return the minimum number of operations to make all elements of nums divisible by 3.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {13,11,12};
		int count = 0;
		
		for(int i=0;i<nums.length;i++)
		{
		
			if(nums[i]%3!=0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}

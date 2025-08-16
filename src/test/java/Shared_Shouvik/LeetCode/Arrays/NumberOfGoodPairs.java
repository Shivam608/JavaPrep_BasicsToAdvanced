package LeetCode.Arrays;

public class NumberOfGoodPairs {
	
//	Given an array of integers nums, return the number of good pairs.
//
//			A pair (i, j) is called good if nums[i] == nums[j] and i < j.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,1,3};
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}

package LeetCode.Arrays;

public class ConcatenationOfTwoSimilarArrays {
	
//	Input: nums = [1,2,1]
//	Output: [1,2,1,1,2,1]
//	Explanation: The array ans is formed as follows:
//	- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//	- ans = [1,2,1,1,2,1]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int[] ans = new int[2*(arr.length)];
		
		for(int i=0;i<arr.length;i++)
		{
			ans[i] = arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			ans[(arr.length)+i] = arr[i];
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i] + " ");
		}

	}

}

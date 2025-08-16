package LeetCode.Arrays;

public class BuildArrayFromPermutation {
	
//	Input: nums = [0,2,1,5,3,4]
//	Output: ans = [0,1,2,4,5,3]
	
//	ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,2,1,5,3,4};
		int ans[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			ans[i]=arr[arr[i]];
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i] + " ");
		}

	}

}

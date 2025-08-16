package LeetCode.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7}; //2,3,5,4,1,7
		int n=3;
		int[] output= new int[nums.length];
		int count =0;
		//output[0]=nums[0];
		for(int i=0;i<n;i++)
		{
			output[count]=nums[i];
			output[count+1]=nums[i+n];
			count = count +2;
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		

	}

}

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,58,45,89,65,75,21,23,88};
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
		}
		

	}

}

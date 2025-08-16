
public class secondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,1,6,8,7};
		int temp;
		//sorting - low to high
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		for(int i =arr.length-2;i>=0;i--)
		{		
			System.out.println(arr[i]);
			break;
			
		}

	}

}

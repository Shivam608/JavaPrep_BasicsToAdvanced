
public class FirstAndLastElementOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,8,8,10,8};
		int firstIndex = -1;
		int lastIndex = -1;
		int search=8;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search && firstIndex == -1)
			{
				firstIndex=i;
			}
			
			if(arr[i]==search && firstIndex !=-1)
			{
				lastIndex = i;
			}
			
		}
		
		System.out.println("first=" + firstIndex);
		System.out.println(lastIndex);

	}

}

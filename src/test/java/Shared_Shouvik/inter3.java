import java.util.Arrays;

public class inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,7,9,4};
		int[] arr1 = {9,7,6,5,2};
		int a = 13;
		//O(N)
		
//		for(int i=0;i<arr.length;i++) {
//			
//			int b=a-arr[i];
//			for(int j=0;j<arr.length;j++) {
//				if(b==arr[j]) {
//					System.out.println("Other number of the pair is: " + arr[j]);
//				}
//			}
//			
//		}
		
//		for(int i=0;i<arr.length-1;i++) {
//			//int b = arr[i];
//			if(arr[i]+arr[i+1]==a) {
//				System.out.println("Number is: "+arr[i]);
//				System.out.println("Number is: "+arr[i+1]);
//			}
//		}
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		//System.out.println(Arrays.equals(arr, arr1));
//		boolean isEqual = true;
//		for(int i=0;i<arr1.length;i++) {
//			if(arr1[i]==arr[i]) {
//				isEqual=true;
//			}
//			else {
//				isEqual=false;
//			}
//		}
//		 System.out.println("The larger array contains all the elements of smaller array? " + isEqual);
		
		char ch1[] = arr1.toString().toCharArray();
		char ch[] = arr.toString().toCharArray();

		boolean isEqual = true;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch[i]) {
				isEqual=true;
			}
			else {
				isEqual=false;
			}
		}
		 System.out.println("The larger array contains all the elements of smaller array? " + isEqual);

		

	}

}

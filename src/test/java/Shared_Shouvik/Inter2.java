import java.util.*;
import java.util.LinkedHashSet;
public class Inter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try programiz.pro");
        int[] arr= {10,1,3,1,1,4,5,9};
        Arrays.sort(arr);
	    LinkedHashSet<Integer> hs = new LinkedHashSet<>();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        hs.add(arr[i]);
	    }
	    System.out.println(hs);
	    
	    Integer[] integerArr = hs.toArray(new Integer[0]);
	    int[] ans = new int[integerArr.length];
	    
	    for(int i=0;i<ans.length;i++)
	    {
	    	ans[i]=integerArr[i];
	    }
	    for(int i=0;i<ans.length;i++)
	    {
	    	System.out.print(ans[i]+" ");
	    }
	    
	    System.out.println();
	    System.out.println("Second smallest element is: "+ans[1]);

	}

}

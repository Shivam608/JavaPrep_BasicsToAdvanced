import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 371;
//		int r=0;
//		double sum=0;
//		while(num!=0)
//		{
//			r=num%10;
//			sum = sum + Math.pow(r, 3);
//			num= num/10;
//			
//		}
//		System.out.println(sum);
//		if(sum==num)
//		{
//			System.out.println("Armstron true");
//		}
//		else
//		{
//			System.out.println("Armstrong false");
//		}
		
		
		
		
//		String str="my name is lekha , i am an automation engineer .";
//		String[] str1=str.split(" ");
//		StringBuilder ans = new StringBuilder();
//		for(int i=str1.length-1;i>=0;i--)
//		{
//			StringBuilder temp = new StringBuilder(str1[i]);
//			ans.append(temp + " ");
//		}
//		System.out.println(ans);
		
		
		
		
//		String str = "Souvik";
//		StringBuilder ans = new StringBuilder(str);
//		System.out.println(ans.reverse());
		
		
		
//		int arr1[] = {1,3,5,7,9};
//		int arr2[] = {2,4,6,8,10};
//		int arr3[] = new int[arr1.length+arr2.length];
//		
//		for(int i=0;i<arr1.length;i++)
//		{
//			arr3[i] = arr1[i];
//		}
//		for(int i=0;i<arr2.length;i++)
//		{
//			arr3[arr1.length+i] = arr2[i];
//		}
//		Arrays.sort(arr3);
//		for(int i=0;i<arr3.length;i++)
//		{
//			System.out.print(arr3[i]+" ");
//		}
//		System.out.println();
//		System.out.println(arr3[1]+arr3[arr3.length-2]);
		
		
		
		
//		String input = "I love my country";
//		String[] str = input.split(" ");
//		StringBuilder ans = new StringBuilder();
//		for(int i=0;i<str.length;i++)
//		{
//			if(str[i].contains("love"))
//			{
//				StringBuilder temp = new StringBuilder(str[i]);
//				ans.append(temp.reverse()+" ");
//			}
//			else
//			{
//				StringBuilder temp = new StringBuilder(str[i]);
//				ans.append(temp+" ");
//				
//			}
//		}
//		System.out.println(ans);
		
		
		
		
//		String input = "SouvikDas";
//		int count=0;
//		for(int i=0;i<input.length();i++)
//		{
//			if(input.charAt(i)>='A' && input.charAt(i)<='Z')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
//		String input = "I love my country";
//		String[] str = input.split(" ");
//		StringBuilder ans = new StringBuilder();
//		for(int i=0;i<str.length;i++)
//		{
//			StringBuilder temp = new StringBuilder(str[i]);
//			ans.append(temp.reverse()+" ");
//		}
//		System.out.print(ans);
		
		
		
		
//		String str = "souviksouvik";
//		LinkedHashSet<Character> hs = new LinkedHashSet<>();
//		for(int i=0;i<str.length();i++)
//		{
//			hs.add(str.charAt(i));
//		}
//		System.out.println(hs);
		
		
		
		
//		String input = "aasshhhfdsfg";
//		char[] ch = input.toCharArray();
//		HashMap<Character, Integer> map = new HashMap<>();
//		for(char c:ch)
//		{
//			if(map.containsKey(c))
//			{
//				map.put(c, map.get(c)+1);
//			}
//			else
//			{
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
//		Set<Character> key = map.keySet();
//		for(char c:key)
//		{
//			if(map.get(c)>1)
//			{
//				System.out.println(c+"="+map.get(c));
//			}
//		}
		
		
		
		
		
//		int[] arr = {5,7,7,8,8,10,8};
//		int search=8;
//		int first=-1;
//		int last=-1;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==search && first==-1)
//			{
//				first=i;
//			}
//			if(arr[i]==search && first!=-1)
//			{
//				last=i;
//			}
//		}
//		System.out.println(first);
//		System.out.println(last);
		
		
		
//		String str= "Geeks For Geeks";
//		String[] str1 = str.split(" ");
//		HashMap<String, Integer> map = new HashMap<>();
//		for(String s:str1)
//		{
//			if(map.containsKey(s))
//			{
//				map.put(s, map.get(s)+1);
//			}
//			else
//			{
//				map.put(s, 1);
//			}
//		}
//		
//		for(String s:str1)
//		{
//			if(map.get(s)==1)
//			{
//				System.out.println(s);
//				break;
//			}
//		}
		
		
		
		
//		String str = "a2b3c4";
//		for(int i=0;i<str.length();i++)
//		{
//			if(Character.isAlphabetic(str.charAt(i)))
//			{
//				System.out.print(str.charAt(i));
//			}
//			else
//			{
//				int n = Character.getNumericValue(str.charAt(i));
//				for(int j=1;j<n;j++)
//				{
//					System.out.print(str.charAt(i-1));
//				}
//			}
//		}
		
		
		
		
//		int arr[] = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
//		int count =0;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]+1==arr[i+1])
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
		
//		int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
//		int count=0;
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==1)
//			{
//				count++;
//				max=Math.max(count, max);
//			}
//			else
//			{
//				count=0;
//			}
//		}
//		System.out.println(max);
		
		
		
		
//		int[] inputArr = { 1, 0, 2, 0, 3, 0, 0, 0 };
//		int count=0;
//		for(int i=0;i<inputArr.length;i++)
//		{
//			if(inputArr[i]!=0)
//			{
//				inputArr[count++]=inputArr[i];
//			}
//		}
//		while(count<inputArr.length)
//		{
//			inputArr[count++]=0;
//		}
//		for(int i=0;i<inputArr.length;i++)
//		{
//			System.out.print(inputArr[i]+" ");
//		}
		
		
		
		
//		String s1= "souvik";
//		String s2= "das";
//		String s=s1+s2;
//		s2=s.substring(0, s.length()-s2.length());
//		s1=s.substring(s2.length());
//		System.out.println(s1);
//		System.out.println(s2);
		
		
		
//		int num = 371;
//		double r=0;
//		double s=0;
//		while(num!=0)
//		{
//			r=num%10;
//			s=s+Math.pow(r, 3);
//			num=num/10;
//		}
//		System.out.println(s);
		
		
		
//		String str="my name is lekha , i am an automation engineer .";
//		String[] str1 = str.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for(int i=str1.length-1;i>=0;i--)
//		{
//			StringBuilder temp = new StringBuilder(str1[i]);
//			sb.append(temp+ " ");
//		}
//		System.out.println(sb);
		
		
		
//		String str = "Souvik";
//		StringBuilder sb = new StringBuilder(str);
//		System.out.println(sb.reverse());
		
		
		
		
//		int arr1[] = {1,3,5,7,9};
//		int arr2[] = {2,4,6,8,10};
//		int sum[] = new int[arr1.length+arr2.length];
//		
//		for(int i=0;i<arr1.length;i++)
//		{
//			sum[i] = arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++)
//		{
//			sum[arr1.length+i] = arr2[i];
//		}
//		
//		Arrays.sort(sum);
//		for(int i=0;i<sum.length;i++)
//		{
//			System.out.print(sum[i]+" ");
//		}
//		System.out.println();
//		System.out.println("2nd highest: "+sum[sum.length-2]);
//		System.out.println("2nd lowest: "+sum[1]);
//		System.out.println("sum is: "+ (sum[sum.length-2]+sum[1]));
		
		
		
		
//		String input = "I love my country";
//		String[] arr = input.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i].contains("love"))
//			{
//				StringBuilder temp = new StringBuilder(arr[i]);
//				sb.append(temp.reverse()+" ");
//			}
//			else
//			{
//				StringBuilder temp = new StringBuilder(arr[i]);
//				sb.append(temp+" ");
//			}
//		}
//		System.out.println(sb);
		
		
		
		
//		String input = "SouvikDas";
//		int count =0;
//		for(int i=0;i<input.length();i++)
//		{
//			if(input.charAt(i)>='A' && input.charAt(i)<='Z')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
//		String str = "souviksouvik";
//		LinkedHashSet<Character> hs = new LinkedHashSet<>();
//		for(int i=0;i<str.length();i++)
//		{
//			hs.add(str.charAt(i));
//		}
//		System.out.println(hs);
		
		
		
//		int num = 454852466;
//		String str = Integer.toString(num);
//		char[] ch = str.toCharArray();
//		HashMap<Character, Integer> map = new HashMap<>();
//		for(char c:ch)
//		{
//			if(c%2==0) {
//			if(map.containsKey(c))
//			{
//				map.put(c,map.get(c)+1);
//			}
//			else
//			{
//				map.put(c, 1);
//			}
//			}
//		}
//		
//		System.out.println(map);
//		
//		Set<Character> key = map.keySet();
//		for(char c:key)
//		{
//			
//			if(map.get(c)>1)
//			{
//				System.out.println(c+"="+map.get(c));
//			}
//		}
		
		
		
		
//		int[] arr = {5,7,7,8,8,10,8};
//		int first = -1;
//		int last =-1;
//		int search = 8;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==search && first==-1)
//			{
//				first=i;
//			}
//			if(arr[i]==search && first!=-1)
//			{
//				last=i;
//			}
//			
//		}
//		System.out.println(first);
//		System.out.println(last);
		
		
		
//		String str = "a2b3c4";
//		for(int i=0;i<str.length();i++)
//		{
//			if(Character.isAlphabetic(str.charAt(i)))
//			{
//				System.out.print(str.charAt(i));
//			}
//			else
//			{
//				int a =Character.getNumericValue(str.charAt(i));
//				for(int j=1;j<a;j++)
//				{
//					System.out.print(str.charAt(i-1));
//				}
//			}
//		}
		
		
		
		
//		int arr[] = { 4, 3, 25, 6, 7, 8, 9, 2, 6, 10 };
//		int c = 1;
//		int m = -1;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]+1==arr[i+1])
//			{
//				c++;
//				m = Math.max(c, m);
//			}
//			else
//			{
//				c=1;
//			}
//		}
//		System.out.println(m);
		
		
		
//		int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
//		int c=0;
//		int m=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==1)
//			{
//				c++;
//				m= Math.max(c, m);
//			}
//			else
//			{
//				c=0;
//			}
//		}
//			System.out.println(m);
		
		
		
//		int num = 371;
//		int r=0;
//		double s=0;
//		while(num!=0) {
//			r=num%10;
//			s=s+Math.pow(r, 3);
//			num=num/10;
//		}
//		System.out.println(s);
		
		
//		String str="my name is lekha , i am an automation engineer .";
//		String[] str2 = str.split(" ");
//		StringBuilder ans = new StringBuilder();
//		for(int i=0;i<str2.length;i++) {
//			StringBuilder temp = new StringBuilder(str2[i]);
//			ans.append(temp.reverse()+" ");
//		}
//		System.out.println(ans);
		
		
		
		
//		int arr1[] = {1,3,5,7,9};
//		int arr2[] = {2,4,6,8,10};
//		int sum[] = new int[arr1.length+arr2.length];
//		
//		for(int i=0;i<arr1.length;i++) {
//			sum[i] = arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			sum[arr1.length+i] = arr2[i];
//		}
//		Arrays.sort(sum);
//		for(int i=0;i<sum.length;i++) {
//			System.out.print(sum[i]+ " ");
//		}
		
//		String input = "I love my country";
//		String[] str = input.split(" ");
//		StringBuilder ans = new StringBuilder();
//		for(int i=0;i<str.length;i++) {
//			if(str[i].contains("love")) {
//				StringBuilder temp = new StringBuilder(str[i]);
//				ans.append(temp.reverse()+" ");
//			}
//			else
//			{
//				StringBuilder temp = new StringBuilder(str[i]);
//				ans.append(temp+" ");
//			}
//			
//			
//		}
//		System.out.println(ans);
		
		
		
		
//		String input = "SouvikDas";
//		int count=0;
//		for(int i=0;i<input.length();i++) {
//			if(input.charAt(i)>='A' && input.charAt(i)<='Z') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
//		String str = "souviksouvik";
//		LinkedHashSet<Character> hs = new LinkedHashSet<>();
//		for(int i=0;i<str.length();i++) {
//			hs.add(str.charAt(i));
//		}
//		System.out.println(hs);
//		
//		Character[] chArray = hs.toArray(new Character[0]);
//		char[] ch = new char[chArray.length];
//		for(int i=0;i<ch.length;i++) {
//			ch[i] = chArray[i];
//		}
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]+" ");
//		}
		
		
		
//		int num = 454852466;
//		String str = Integer.toString(num);
//		char[] ch = str.toCharArray();
//		
//		HashMap<Character, Integer> map = new HashMap<>();
//		for(char c:ch) {
//			if(c%2==0) {
//				if(map.containsKey(c)) {
//					map.put(c, map.get(c)+1);
//				}
//				else
//				{
//					map.put(c, 1);
//				}
//			}
//		}
//		System.out.println(map);
//		
//		Set<Character> key = map.keySet();
//		for(char c:key) {
//			if(map.get(c)>1) {
//				System.out.println(c+"="+map.get(c));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
	}

}

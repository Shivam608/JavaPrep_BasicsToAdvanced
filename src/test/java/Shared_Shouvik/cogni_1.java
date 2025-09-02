package Shared_Shouvik;

import java.util.Arrays;

public class cogni_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Hello Hello World";

		 /// Output = I evol ym yrtnuoc
	       /*String[] str = input.split(" ");
	       StringBuilder ans = new StringBuilder();
	       
	       for(int i=0;i<str.length;i++)
	       {
	           StringBuilder temp = new StringBuilder(str[i]);
	           ans.append(temp.reverse() + " ");
	           //System.out.println(ans + " ");
	       }
	       
	       System.out.print(ans + " ");*/

		String[] splitString = input.split(" ");

		StringBuilder b = new StringBuilder();
        for (String s : splitString) {
            for (int j = s.length() - 1; j >= 0; j--) {
                b.append(s.charAt(j));
            }
            b.append(" ");
        }

		String[] reversedSplit = String.valueOf(b).split(" ");

		for (int i = 0; i < reversedSplit.length-1; i++) {
			input = input.replace(splitString[i], reversedSplit[i]);
		}

		System.out.println(input);

	}

}

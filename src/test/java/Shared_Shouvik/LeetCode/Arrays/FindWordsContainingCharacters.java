package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacters {
	
//	You are given a 0-indexed array of strings words and a character x.
//
//	Return an array of indices representing the words that contain the character x.
//
//	Note that the returned array may be in any order.
//	
//	Example 1:
//
//	Input: words = ["leet","code"], x = "e"
//	Output: [0,1]
//	Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		
		List<String> wordsList = Arrays.asList(words);
		String var = Character.toString(x);
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<wordsList.size();i++)
		{
			if(wordsList.get(i).contains(var))
			{
				list.add(i);
			}
		}
		System.out.println(list);

	}

}

package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LengthOfLongestSubstring {
	public static int LengthOfLongSS(String str)
	{
		int start=0;
		int end=0;
		int max_length=0;
		List<Character> list=new ArrayList<Character>();
		
		
		
		while(end<str.length())
		{
			if(!list.contains(str.charAt(end)))
			{
				list.add(str.charAt(end));
				end++;
				max_length=Math.max(list.size(), max_length);
				
			}
			
			else
			{
				list.remove(Character.valueOf(str.charAt(end)));
				start++;
			}
		}
		return max_length;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int l=LengthOfLongSS(s);
		System.out.println(" Length of longest substring: "+l);
		
		
	}

}

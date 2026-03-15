package Practice;

import java.util.Scanner;

public class ReverseWordsInString {
	
	public static String reverseWords(String s)
	{
		
		String words[]=s.split(" +");
		StringBuilder r=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--)
		{
			r.append(words[i]);
			r.append(" ");
		}
		return r.toString().trim();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		System.out.println(" enter string to reverse words ");
		String s=sc.nextLine();
		String rev=reverseWords(s);
		System.out.println(rev);
		
	}

}

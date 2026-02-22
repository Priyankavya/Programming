package Practice;

import java.util.Scanner;

public class StringReverseUsingWhile {
	
	public static String Reverse(String s)
	{
		char carr[]=s.toCharArray();
		
		int start=0;
		int end=carr.length-1;
		
		while(start<end)
		{
	           char temp=carr[start];
	           carr[start]=carr[end];
	           carr[end]=temp;
	           start++;
	           end--;
		}
		
		String reversed=new String(carr);
		return reversed;
		
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println("Reversed string is   "+ Reverse(s));
	}

}

package Practice;

import java.util.Scanner;

public class StringReverseUsingFor {
	
	
	public static String Reverse(String s) {
		
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println("Reversed string is   "+ Reverse(s));
	}

	
}

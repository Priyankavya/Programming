package Practice;

import java.util.Scanner;

public class PalindromeCheck {

public static boolean ispalindrome(String s) {
		
	{
		int start=0;
		int end=s.length()-1;
		
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				return false;
				
			}
			start++;
			end--;
			
		}
		return true;
	}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println("Reversed string is paindrome : "+ ispalindrome(s));
	}

	
}

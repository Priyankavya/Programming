package Practice;

import java.util.Scanner;

public class MostOccuredCharInString {

	public static char MostOccured(String s)
	{
		 int [] freq=new int [256];
		
		 
		 for(int i=0;i<s.length()-1;i++)
		 {
			 freq[s.charAt(i)]++;
		 }
		 
		 int max=0;
		 char result=' ';
		 
		 for(int i=0;i<s.length();i++)
		 {
			 if(freq[s.charAt(i)]>max)
			 {
				 max=freq[s.charAt(i)];
				 result=s.charAt(i);
			 }
		 }
		 
		 return result;
		
	}
	
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println("Most occured Character is    "+ MostOccured(s));
	}
}

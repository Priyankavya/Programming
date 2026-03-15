package Practice;

import java.util.Scanner;

public class NumberOfCharactersInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter string to reverse words ");
		String s=sc.nextLine();
		int n=numberOfChar(s);
		System.out.println(" total characters  : "+n);
	}

	private static int numberOfChar(String s) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		return count;
	}

}

package Practice;

import java.util.Scanner;

public class UnmatchedString {

	public static String getUnmatched(String str1, String str2) {
		String unmatched=" ";
		
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			
			if(str2.indexOf(ch)==-1)
			{
				unmatched=unmatched+ch;
 
			}
		}
		return unmatched;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = getUnmatched(str1, str2);

        System.out.println("Unmatched characters: " + result);


	}

	

}

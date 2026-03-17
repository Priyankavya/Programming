package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringCheck {
	
	public static boolean isAnagram(String a,String b)
	{
		if(a.length()!=b.length())
		{
			return false;
		}
		else {
		char m[]=a.toCharArray();
		char n[]=b.toCharArray();
		Arrays.sort(m);
		Arrays.sort(n);
		
		if(Arrays.equals(m, n))
		{
			return true;
		}
		else
		{
			return false;
		}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        if(isAnagram(str1,str2))
        {
        	System.out.println(" Strings are anagram");
        }

        else
        {
        	System.out.println(" Strings are  not anagram");
        }

	}

}

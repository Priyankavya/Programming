package Practice;

import java.util.Scanner;

public class StartingIndexOfNeedleInString {
	
  public static int strStr(String haystack, String needle) {
        
        for(int i=0;i< haystack.length()-needle.length()+1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.substring(i,needle.length()+i).equals(needle))
                {
                    return i;
                }


            }

           
        }

         return -1;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter string haystack");
		String haystack=sc.next();
		sc.nextLine();
		
		System.out.println(" enter string needle whose  starting index you need to find");
		String needle=sc.next();
		
		int n=strStr(haystack,needle);
		System.out.println(" Starting Index of needle is  : "+n);
		
		
	}

}

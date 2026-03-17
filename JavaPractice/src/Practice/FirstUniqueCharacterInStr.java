package Practice;

import java.util.Scanner;

public class FirstUniqueCharacterInStr {

	public static int firstUniqChar(String s) {
	       
		 for(int i=0;i<s.length();i++)
	        {
	            int count=0;
	            for(int j=0;j<s.length();j++)
	            {
	                if(s.charAt(i)==s.charAt(j))
	                {
	                    count++;
	                }

	               
	            }
	            if(count==1)
	              {
	                return i;
	              }
	           
	        }

	         return -1;
	    }
    
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string:");
        String str1 = sc.nextLine();
        int ch=firstUniqChar(str1);
        
        System.out.println("Answer "+ch);


	}

	private static char firstUniqueCharacterInStr(String str1) {
		// TODO Auto-generated method stub
		return 0;
	}

}

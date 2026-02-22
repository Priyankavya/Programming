package Practice;

import java.util.Scanner;

public class DecimalToBinary {
	
	
	public static StringBuilder DecimalToBinary(int n)
	{
		StringBuilder binary=new StringBuilder();
		
		
		if(n==0)
		{
			return binary;
			
		}
		while(n>0)
		{
			int remainder=n%2;
			
			binary.append(remainder);
			
			n=n/2;
		}
		
		return binary;
		
	}
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter numberto convert into binary ");
		int n=sc.nextInt();
		System.out.println("Decimal to binary converted :"+DecimalToBinary(n));
	}

}

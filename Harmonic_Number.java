package basic_core_programs;

import java.util.*;  
public class Harmonic_Number
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,i;
		float sum=0;

		Scanner sc=new Scanner(System.in);  
	    n = sc.nextInt();  
		for(i=1;i<=n;i++)
		{
		sum=sum+(float)1/i;
		}

	}

}

package basic_core_programs;

public class PowerOf2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub


		int n = Integer.parseInt(args[0]);

		int i = 0; // count from 0 to N

		int powerOfTwo = 1; // the ith power of two

		
		while (i <= n)
		{
		System.out.println(i + " " + powerOfTwo); 

		powerOfTwo = 2 * powerOfTwo; 

		i = i + 1;
	
		}
		}
	}


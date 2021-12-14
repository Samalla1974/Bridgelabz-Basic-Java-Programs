package Basic_Logical_Programs;

import java.util.*;  
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		int num = sc.nextInt();  
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	    	  System.out.println(num + " is a prime number.");
	      }
	  	    else
	  	    {
	  	      System.out.println(num + " is not a prime number.");
	      }
	    }
	      
	}

}

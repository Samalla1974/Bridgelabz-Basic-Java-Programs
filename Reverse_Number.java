package Basic_Logical_Programs;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, reversed = 0;
s
	    while(num != 0) {
	   
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}

}

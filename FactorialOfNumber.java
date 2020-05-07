package recursion;

import java.util.Scanner;

public class FactorialOfNumber {

	private static long factorial(int num) 
	{
		if (num>=1)
	        return num*factorial(num-1);
	    else
	        return 1;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Enter an Positive Integer : ");
		num = sc.nextInt();

		System.out.println("The Factorial of "+num+" Natural Numbers is : "+factorial(num));
	}
}

/*
Output :
	Enter an Positive Integer : 
		5
		The Factorial of 5 Natural Numbers is : 120
*/
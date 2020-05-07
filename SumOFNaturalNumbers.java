package recursion;

import java.util.Scanner;

public class SumOFNaturalNumbers {


	public static int addNumbers(int num) {
		if (num != 0)
	        return num + addNumbers(num - 1);
	    else
	        return num;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
	    System.out.println("Enter an Positive Integer : ");
	    num = sc.nextInt();
	    
	    System.out.println("The Sum of "+num+" Natural Numbers Using Resursion : "+addNumbers(num));
	}
}

/*
Output: 
	Enter an Positive Integer : 
		20
		The Sum of 20 Natural Numbers Using Resursion : 210

*/
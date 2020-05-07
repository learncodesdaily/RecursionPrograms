package recursion;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	
	public static int gcdUsingRecursion(int num1, int num2) 
	{
		if (num2 != 0)
	        return gcdUsingRecursion(num2, num1 % num2);
	    else
	        return num1;
	}
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int num1,num2;

		System.out.println("Enter Two Positive Integers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		
		System.out.println("\nG.C.D of "+num1+" and "+num2+" Using Recursion is "+gcdUsingRecursion(num1,num2));
	}
}

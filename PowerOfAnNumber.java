package recursion;

import java.util.Scanner;

public class PowerOfAnNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base,exp;
		double result = 1;

		System.out.println("Enter the BASE and EXPONENT values : ");
		base = sc.nextInt();
		exp = sc.nextInt();


		System.out.println("The answer of "+base+"^"+exp+" is : "+power(base,exp));
	}

	private static int power(int base, int exp) {
		    if (exp != 0)
		        return (base * power(base, exp - 1));
		    else
		        return 1;
		}
}

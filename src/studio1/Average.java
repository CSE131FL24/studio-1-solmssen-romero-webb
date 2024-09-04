package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String [] args ){
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Please enter the first value for your average.");
		int n1 = scan.nextInt();
		System.out.println("Please enter the second value for your average.");
		int n2 = scan.nextInt();
		
		System.out.println("The average of the values " +n1+ " and " + n2 + " is " + ((double)(n1+n2)/2)+".");
		
		
	}

}

package com.lms;
import java.util.Scanner;
public class StrongNumber {
	 public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        int fact = 1;
	        for (int i = 2; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static boolean isStrongNumber(int number) {
	        int sumOfFactorials = 0;
	        int temp = number;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sumOfFactorials += factorial(digit);
	            temp /= 10;
	        }

	        return sumOfFactorials == number;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	      
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }
	    }
}

/****************************************************************
 * Purpose : To find the roots of quadratic equation.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class Quadratic {

	// Method to find the value of delta.
	public static double findDelta(int a, int b, int c) {
		double delta = b * b - 4 * a * c;
		return delta;
	}

	// Method to find the roots of equation.
	public static void findRoots(int a, int b, int c) {
		double delta = findDelta(a, b, c);

		// Checking if equation has two real roots.
		if (delta > 0) {
			double X1 = (-b + Math.sqrt(delta)) / (2 * a);
			double X2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("First root of the equation is: " + X1);
			System.out.println("Second root of the equation is: " + X2);
		} else 
			System.out.println("The equation has no two real roots");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User input for value of a b c.
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter value of b: ");
		int b = sc.nextInt();

		System.out.println("Enter value of c: ");
		int c = sc.nextInt();
		findDelta(a, b, c);
		findRoots(a, b, c);
		sc.close();

	}

}

/****************************************************************
 * Purpose : To take the option from user and print the int, double or boolean array.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class Array2D {

	// Method to print Integer Array.
	public static void intArray(int m, int n) {
		int arr1[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr1[i][j]);
			}
			System.out.println(" ");
		}
	}

	// Method to print Double Array.
	public static void doubleArray(int m, int n) {
		double arr2[][] = new double[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr2[i][j]);
			}
			System.out.println(" ");
		}
	}

	// Method to print Boolean Array.
	public static void booleanArray(int m, int n) {
		boolean arr3[][] = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr3[i][j]);
			}
			System.out.println(" ");
		}
	}

	// Method to allow user to choose the option for integer, double and boolean
	// array.
	public static void chooseType(int m, int n) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Integer array");
		System.out.println("Enter 2 for Double array");
		System.out.println("Enter 3 for Boolean array");
		int option = sc.nextInt();
		sc.close();

		switch (option) {

		case 1:
			System.out.println("printing integer array");
			intArray(m, n);
			break;

		case 2:
			System.out.println("printing double array");
			doubleArray(m, n);
			break;

		case 3:
			System.out.println("printing boolean array");
			booleanArray(m, n);
			break;

		default:
			System.out.println("Enter valid option");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User input for rows and column.
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of Columns: ");
		int n = sc.nextInt();
		chooseType(m, n);
		sc.close();

	}

}

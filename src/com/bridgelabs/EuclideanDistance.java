/****************************************************************
 * Purpose :
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class EuclideanDistance {
	
	public static void performEculideanDist(int x, int y) {
		double result = ( Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)) ) );
		System.out.println("Euclidean distance is: " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		performEculideanDist(x, y);
		sc.close();
		

	}

}


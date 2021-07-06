/****************************************************************
 * Purpose : To find the wind chill from given temperature and wind speed.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class WindChill {

	// Method to perform Wind chill.
	public static void performWindChill(int t, int v) {
		if (t > 50 || v < 3 || v > 120)
			System.out.println("Enter valid temperature and wind speed");
		else {
			double wind_chill = 35.74 + 0.6215 * t + ((0.4275 * t) - (35.75)) * (Math.pow(v, 0.16));
			System.out.println("Wind chill for temperature " + t + " and wind speed " + v + " is " + wind_chill);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User input for temperature and wind speed.
		System.out.println("Enter temperature in Fahrenheit: ");
		int temperature = sc.nextInt();

		System.out.println("Enter Wind speed: ");
		int wind_speed = sc.nextInt();
		performWindChill(temperature, wind_speed);
		sc.close();

	}

}

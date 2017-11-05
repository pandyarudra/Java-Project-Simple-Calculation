/**
 * 
 */
package com.pandya.rudra;
import java.util.Scanner;

/**
 * @author Rudra Pandya
 *
 */
public class Painting {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double  houseLength, houseHeight, houseWidth, houseTSA, totalDoors
				, totalWindows, areaOfDoors, areaOfWindows, cva;
		String doors, windows;
		System.out.println("Enter the length of the house: ");
		houseLength = in.nextDouble();
		System.out.println("Enter the height of the house: ");
		houseHeight = in.nextDouble();
		System.out.println("Enter the width of the house: ");
		houseWidth = in.nextDouble();

		System.out.println("Enter the number and area of windows separated by comma(','): ");
		windows = in.next();
		totalWindows = Double.parseDouble(windows.split(",")[0]);
		areaOfWindows = Double.parseDouble(windows.split(",")[1]);
		System.out.println("Enter the number and area of doors separated by comma(','): ");
		doors = in.next();
		totalDoors = Double.parseDouble(doors.split(",")[0]);
		areaOfDoors = Double.parseDouble(doors.split(",")[1]);
		houseTSA = (2 *(houseHeight * houseLength) + 2 * (houseWidth * houseHeight)) - ((totalDoors * areaOfDoors) + (totalWindows * areaOfWindows)) ;
		
		System.out.println("Enter the coverage area per gallon:");
		cva = in.nextDouble();
		System.out.printf("The total area where the paint is required is: %5.2f sq. meters and the total gallons required are: %5.2f", houseTSA, houseTSA/cva);
	}

}

package com.linecomputation;

import java.util.Scanner;

public class LineComparision {
	public static int lineLengthComputation() {
		/*
		 * Asking User To Calculate The Lengths Of Two Lines Enter Values Of Point To
		 * Calculate The Lengths
		 */
		int x1;
		int x2;
		int y1;
		int y2;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of : x1,x2,x3,x4");
		x1 = src.nextInt();
		y1 = src.nextInt();
		x2 = src.nextInt();
		y2 = src.nextInt();
		/*
		 * //method to calculate the distance of lines
		 */
		int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return lineLength;

	}
	/*
	 * //method for calculate two lengths
	 */

	public static void equalityCheck(int line1, int line2) {
		if (line1 == line2) {
			System.out.println("Lines are Equal");
		} else if (line1 > line2) {
			System.out.println("Line-1 is greater than Line2 ");
		} else {
			System.out.println("Line-2 is greater than Line1 ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program on master branch ");
		int line1 = lineLengthComputation();
		int line2 = lineLengthComputation();
		System.out.println("The length of line 1 is: " + line1);
		System.out.println("The length of line 2 is: " + line2);
		equalityCheck(line1, line2);

	}

}

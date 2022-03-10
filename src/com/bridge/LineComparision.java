package com.bridge;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wel Come To Line Comparision Computation");

	}

}

class LengthProduce {
	public static int x1, x2, y1, y2, x3, x4, y3, y4;

	public void lengthproduce() {
		Scanner sc = new Scanner(System.in);
		System.out.println("For given line");
		System.out.println("Enter co-ordinates of x1 and y1");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter co-ordinates of x2 and y2");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		System.out.println("For second line");
		System.out.println("Enter co-ordinates of x3 and y3");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		System.out.println("Enter co-ordinates of x4 and y4");
		x4 = sc.nextInt();
		y4 = sc.nextInt();
	}
}

package com.johnson.areacalculator;

public class AreaCircle {

	static double r = 4;
	static double pi = 3.14;
	static double area = r*pi*pi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcAreaOfCircle(pi, r);
		displayArea(area);
	}

	public static void calcAreaOfCircle(double x, double y) {
		
		double a = x*y*y;
	}

	public static void displayArea(double z) {
		
		System.out.println(z);
	}
}
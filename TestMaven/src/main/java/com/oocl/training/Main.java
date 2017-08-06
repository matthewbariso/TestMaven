package com.oocl.training;

import java.util.ArrayList;

public class Main {

	public ArrayList<String> exer10c() {
		int value = 5;
		int value2 = 1;
		ArrayList<String> out = new ArrayList<String>();

		while (value2 < 4) {
			for (; value >= value2; value--) {
				out.add("*");
			}
			value2++;
		}
		return out;
	}

	static int value = 10;

	public static void main(String[] args) {
		
		int i = exer10b();
		System.out.println(i);
	}
	
	public static int exer10b() {
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		System.out.println("-----");
		int value = 30;
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		return value;
	}

	static int p1(int input) {
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}

	static int p2(int input) {
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}
}

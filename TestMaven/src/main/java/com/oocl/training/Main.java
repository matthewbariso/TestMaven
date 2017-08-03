package com.oocl.training;

public class Main {
	

	static void fib(int x, int y) {

		if (y > 100) {
			return;
		}
		System.out.print(y + " ");

		fib(y, y + x);

	}
}

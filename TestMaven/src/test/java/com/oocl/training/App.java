package com.oocl.training;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class App {

	@Test
	public void testExer10c() {
		Main m = new Main();

		ArrayList<String> act = m.exer10c();

		assertEquals(m.exer10c(), act);

	}

	@Test
	public void testExer10b() {
		Main m = new Main();

		int act = m.exer10b();

		assertEquals(120, act);

	}
	public void test() {
		// fail("Not yet implemented");
	}

}

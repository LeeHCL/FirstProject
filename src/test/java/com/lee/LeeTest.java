package com.lee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeeTest {
//life cycle
	@BeforeAll
	static void setUp() {
		System.out.println("@BeforeAll Executed");
	}

	@BeforeEach
	void setUpThis() {
		System.out.println("@BeforeEach Executed");
	}

	// Test Case before implementing case =>TDD
	@Test
	void calculateTest() {
		//Assertions.fail("No code has been implemented", new Exception());
		System.out.println("Before Implementing the code");
		int x = Addition.add(12, 12);// actual value
		System.out.println("Test is executed");
		Assertions.assertEquals(24, x);
	}
	
		// Test Case before implementing case =>TDD
		@Test
		void productTest() {
			//Assertions.fail("No code has been implemented", new Exception());
			System.out.println("Before Implenting the code");
			int y = Multiply.product(12, 12);// actual value
			System.out.println("Test is executed");
			Assertions.assertEquals(144, y);
		}

}
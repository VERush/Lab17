package com.gc.primenumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrime {

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	void testMain() {
		PrimeCalc obj = new PrimeCalc();
		int expected = 2;
		int actual = obj.findPrime(1);

		assertEquals(expected, actual);
	}

	@Test
	void testMain2() {
		PrimeCalc obj = new PrimeCalc();
		int expected = 3;
		int actual = obj.findPrime(2);

		assertEquals(expected, actual);
	}

	@Test
	void testMain3() {
		PrimeCalc obj = new PrimeCalc();
		int expected = 181;
		int actual = obj.findPrime(42);

		assertEquals(expected, actual);
	}
}

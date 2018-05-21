package com.gc.primenumbers;

/*
 * @author Vicki Rush
 * Grand Circus Java Bootcamp - Lab 17
 * April 2018 Cohort
 */
public class PrimeCalc {

	public int findPrime(int numToFind) {
		int countDivisors = 0;
		int numFound = 0;
		int numToTest = 0;
		while (numFound < numToFind) {
			numToTest++;
			countDivisors = 0;
			for (int i = 1; i <= numToTest; i++) {
				if (numToTest % i == 0) {
					countDivisors++;
				}
			}
			if (countDivisors == 2) {
				numFound++;
			}
		}
		return numToTest;
	}
}

package com.gc.primenumbers;

import java.util.Scanner;

/*
 * Lab 17
 * @author Vicki Rush  May 20,2018
 *
 */
public class PrimeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfPrime;
		String prompt;

		System.out.printf("Let's locate some primes!%n");
		System.out
				.printf("%nThis application will find you any prime, in order, " + "from the first prime number on.%n");
		prompt = "Which number prime are you looking for? ";
		numberOfPrime = Validator.getInt(scan, prompt);
		System.out.println("Number entered = " + numberOfPrime);

	}

}

package com.gc.primenumbers;

import java.util.Scanner;

/*
 * @author Vicki Rush
 * Grand Circus Java Bootcamp - Lab 17
 * April 2018 Cohort
 */
public class PrimeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrimeCalc pc = new PrimeCalc();
		int numberOfPrime, prime;
		String prompt;
		String cont = "y";

		System.out.printf("Let's locate some primes!%n");
		System.out.printf("%nThis application will find you any prime, in order, " + "from the first prime number on.%n");
		while (cont.equalsIgnoreCase("y")) {
			prompt = "Which number prime are you looking for? ";
			numberOfPrime = Validator.getInt(scan, prompt);
			prime = pc.findPrime(numberOfPrime);
			System.out.printf("%nThe number " + numberOfPrime + " prime is " + prime + ".%n%n");
			prompt = "Do you want to find another prime number (y/n): ";
			cont = Validator.getString(scan, prompt);
		}

	}

}

package com.pack.mockitodemo;

public class Calculator {
	public int performCalculation(CalculatorService cs) {
		System.out.println("Performing calculation");
		return cs.add(20, 20);
	}
}

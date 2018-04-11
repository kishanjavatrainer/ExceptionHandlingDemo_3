package com.infotech.client;

public class MultipleCatchDemo {
	private void calculateValue(int i) {
		int a[] = { 0 };
		try {
			int b = 7 / a[i];
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MultipleCatchDemo multipleCatchDemo = new MultipleCatchDemo();
		multipleCatchDemo.calculateValue(0);
		multipleCatchDemo.calculateValue(2);
	}
}
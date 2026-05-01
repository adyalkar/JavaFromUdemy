package _1_Numbers;

import java.util.ArrayList;

public class _D_FibonacciSeries {

	public static void main(String[] args) {
		// Print Fibonacci series for first 10 terms
		fiboacciSeries(20);
	}

	// Generates and prints Fibonacci series up to 'num' terms
	// e.g. for num=5 → 0 1 1 2 3
	public static void fiboacciSeries(int num) {

		if (num <= 0) {
			System.out.println("Please enter a positive number.");
			return;
		}

		ArrayList<Integer> series = new ArrayList<>();

		int first = 0;   // 1st term
		int second = 1;  // 2nd term

		for (int i = 0; i < num; i++) {
			series.add(first);          // store current term
			int next = first + second;  // calculate next term
			first = second;             // shift: first moves to second's value
			second = next;              // shift: second moves to next value
		}

		System.out.println("Fibonacci Series (" + num + " terms): " + series);
	}
}

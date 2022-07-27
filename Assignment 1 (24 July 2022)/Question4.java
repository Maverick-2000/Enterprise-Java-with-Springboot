package com.maverick.main;

public class Question4 {
	public static void main(String[] args) {
		int n = 16;
		for (int i = 0; i < n; i++) { // Logic 1
			for (int j = 0; j < n; j++) {
				if (i - j >= (n) / 2 || i + j >= n - 1 + n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n * 2; j++) // Logic 2
			{
				if (i + j >= n * 2 - 2 || i >= j)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}
}

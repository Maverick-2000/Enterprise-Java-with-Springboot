package com.maverick.main;

public class Question1 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) { //Logic 1
			for (int j = 0; j < n; j++) // I
			{
				if (j == n / 2||i==0||i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // N
			{
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // E
			{
				if (i == 0 || j == 0 || i == n / 2 || i == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // u
			{
				if (j == 0 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1 || j == n - 1 && i != n - 1)
					System.out.print("* ");

				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // r
			{
				if (i == 0 || j == 0 || i == n / 2 || i == j && i > n / 2 || j == n - 1 && i < n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // o
			{
				if (i == 0 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1
						|| i == n - 1 && j != n - 1 && j != 0 || j == n - 1 && i != n - 1 && i != 0)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // N
			{
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < n; i++) { //Logic 2
			for (int j = 0; j < n; j++) // i
			{
				if (j == n / 2 && i != 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // N
			{
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // e
			{
				if (i == 0 || j == 0 || i == n / 2 || i == n - 1 || j == n - 1 && i < n / 2 + 1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // u
			{
				if (j == 0 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1 || j == n - 1 && i != n - 1)
					System.out.print("* ");

				else
					System.out.print("  ");
			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // r
			{
				if (i == 0 || j == 0 || i == n / 2 || i == j && i > n / 2 || j == n - 1 && i < n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // o
			{
				if (i == 0 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1
						|| i == n - 1 && j != n - 1 && j != 0 || j == n - 1 && i != n - 1 && i != 0)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.print("\t");
			for (int j = 0; j < n; j++) // n
			{
				if (j == 0 && i != 0 || i == 0 && j != 0 && j != n - 1 || j == n - 1 && i != 0)
					System.out.print("* ");

				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}

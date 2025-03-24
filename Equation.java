//NAME&ID Raghad Murad 1212214
//lecture section 5 & lab section 9

import java.util.Scanner;

public class Equation {


	public static int isBalanced(int num) {
		int evensum = 0, oddsum = 0, k;
		if (valid(num)== 1) {
			while (num > 0) {
				k = num % 10;
				if (k % 2 == 0)
					evensum = evensum + k;
				else
					oddsum = oddsum + k;
				num = num / 10;
			}
			if (evensum == oddsum)
				return 1;
			else
				return 0;
		} else
			return 0;
	}

	public static int valid(int num) {
		int d = 1;
		int lastdigit, currentdigit;
		lastdigit = num % 10;
		num = num / 10;
		while (num > 0) {
			currentdigit = num % 10;
			if (lastdigit == currentdigit) {
				d = 0;
			} else {
				lastdigit = currentdigit;
			}
			num = num / 10;
		}
		return d;
	}

	public static double solveEquation(double x, double a, double b, double c) {
		double result;
		result = (a * x * x) + (b * x) + c;
		return result;
	}

	public static void findEquationRoots(double a, double b, double c) {
		double f;
		f = (b * b) - (4 * a * c);
		if (f == 0) {
			double x;
			x = ((-b) + Math.sqrt(f)) / (2 * a);
			System.out.print("There are one root of the equation:" + "x=" + x +"\n");
		} else if (f > 0) {
			double x1, x2;
			x1 = ((-b) + (double) Math.sqrt(f)) / (2 * a);
			x2 = ((-b) - (double) Math.sqrt(f)) / (2 * a);
			System.out.print("There are two roots of the equation:" + "x1=" + x1 + ", x2=" + x2 + "\n");
		} else
			System.out.print("There are complex roots " + "\n");
	}

	public static void combineEquations(double a1, double b1, double c1, double a2, double b2, double c2) {
		double A, B, C;
		A = a1 + a2;
		B = b1 + b2;
		C = c1 + c2;
		System.out.print("The combine equations:" + A + "(X^2)+" + B + "X+" + C + "\n");
	}

	public static void displayMainMenu() {
		System.out.println("\nPlease Select an Operation (1-4):");
		System.out.println("1- Solve Equation.");
		System.out.println("2- Find Equation Roots.");
		System.out.println("3- Combine Equations.");
		System.out.println("4- Exit Menu.\n");
	}

}

//NAME&ID Raghad Murad 1212214
//lecture section 5 & lab section 9

import java.util.Scanner;

public class CheckEquation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("-Please enter your name (first name only):");
		String name = input.next();
		System.out.print("\n-Please enter your ID number (if you want to exit the program, enter -1):");
		int id = input.nextInt();
		double a1,b1,c1,a2,b2,c2,x;
		while (id != -1)
		{
			while (Equation.isBalanced(id)==0)
			{
				System.out.print("\n-Warning: This number is not valid. Please enter a valid number or enter -1 to exit the program.");
				id = input.nextInt();
			}
			System.out.print("\nWelcome " + name + " :) \n");
			Equation.displayMainMenu();
			int Operation = input.nextInt();
			while (Operation!=4)
			{
				switch(Operation)
		        {
		        case 1:
		        	System.out.print("\nEnter the value of x:");
		        	x = input.nextDouble();
		        	System.out.print("Enter the value of the coefficients (a,b,c) of the equation:");
		            System.out.print("\na:");
		            a1 = input.nextDouble();
		            System.out.print("b:");
		            b1 = input.nextDouble();
		            System.out.print("c:");
		            c1 = input.nextDouble();
		            System.out.println("The result is:" + Equation.solveEquation(x, a1, b1, c1));
		            break;
		        case 2:
		        	System.out.print("\nEnter the value of the coefficients (a,b,c) of the equation:");
		            System.out.print("\na:");
		            a1 = input.nextDouble();
		            System.out.print("b:");
		            b1 = input.nextDouble();
		            System.out.print("c:");
		            c1 = input.nextDouble();
		            Equation.findEquationRoots(a1, b1, c1);
		            break;
		        case 3:
		        	System.out.print("\nEnter the value of the coefficients (a,b,c) of the first equation:");
		            System.out.print("\na:");
		            a1 = input.nextDouble();
		            System.out.print("b:");
		            b1 = input.nextDouble();
		            System.out.print("c:");
		            c1 = input.nextDouble();
		            System.out.print("Enter the value of the coefficients (a,b,c) of the second equation:");
		            System.out.print("\na:");
		            a2 = input.nextDouble();
		            System.out.print("b:");
		            b2 = input.nextDouble();
		            System.out.print("c:");
		            c2 = input.nextDouble();
		            Equation.combineEquations(a1, b1, c1, a2, b2, c2);
		            break;
		        default:
		            System.out.println("No such operation! Please try again.");
		            Equation.displayMainMenu();
			        Operation = input.nextInt();
			        break;
		        }
			  Equation.displayMainMenu();
			  Operation = input.nextInt();
			}
			System.out.print("\n-Please enter your name (first name only):");
			name = input.next();
			System.out.print("\n-Please enter your ID number (if you want to exit the program, enter -1):");
			id = input.nextInt();
		}
		System.out.println("\nExit the program.\nGoodBye.");
	}
}
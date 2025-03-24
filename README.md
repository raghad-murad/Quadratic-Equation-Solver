# 📚 Quadratic Equation Solver and ID Validator

A Java program that validates user IDs and provides functionalities to solve quadratic equations, find their roots, and combine two equations.

## 📑 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Code Structure](#code-structure)

## 🌟 Overview

This project is a Java implementation of a program that validates user IDs and performs operations on quadratic equations. The program includes the following functionalities:
- Validate whether an ID number is balanced or not.
- Solve quadratic equations for a given value of `x`.
- Find the roots of a quadratic equation.
- Combine two quadratic equations into one.

The program ensures that invalid IDs are rejected and keeps running until the user decides to exit by entering `-1`.

## ✨ Features

- **ID Validation:** Checks if an ID is valid based on specific rules (balanced digits, no consecutive repeated digits).
- **Solve Equation:** Solves a quadratic equation for a given value of `x` using the formula \( ax^2 + bx + c \).
- **Find Roots:** Calculates the roots of a quadratic equation, handling both real and imaginary roots.
- **Combine Equations:** Combines two quadratic equations into one by summing their coefficients.
- **Menu System:** Provides a user-friendly menu for selecting operations.

## ⚙️ Technologies Used

- **Programming Language:** Java
- **IDE:** Eclipse
- **Tools:** Scanner for user input, Math library for calculations.

## 🏃‍♀️ How to Run

### Prerequisites
- Ensure you have Java installed on your system.
- Install an IDE like Eclipse or IntelliJ IDEA (optional, you can also use the command line).

### Steps to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/raghad-murad/quadratic-equation-solver.git
   cd quadratic-equation-solver
   ```

2. **Compile the Program:**
   - Open the project in your IDE (e.g., Eclipse).
   - Build the project to compile the `.java` files.

3. **Run the Program:**
   - Execute the `CheckEquation` class as the entry point.
   - Follow the on-screen instructions:
     - Enter your name and ID.
     - Select an operation from the menu (e.g., solve equation, find roots, combine equations).
     - Exit the program by entering `-1`.

### Notes
- The program will keep asking for a valid ID until one is entered or the user exits by entering `-1`.
- Invalid IDs are rejected with an appropriate message.

## 🧩 Code Structure

The project consists of two main classes:

1. **`CheckEquation`:**
   - Contains the `main` method.
   - Manages user input and displays the menu.

2. **`Equation`:**
   - Implements all the required methods:
     - `isBalanced(int num):` Checks if an ID is balanced.
     - `valid(int num):` Validates the ID for no consecutive repeated digits.
     - `solveEquation(double x, double a, double b, double c):` Solves a quadratic equation.
     - `findEquationRoots(double a, double b, double c):` Finds the roots of a quadratic equation.
     - `combineEquations(double a1, double b1, double c1, double a2, double b2, double c2):` Combines two equations.
     - `displayMainMenu():` Displays the menu options.

## 🤝 Contact

If you have any questions or suggestions, feel free to reach out!

- **Email:** raghadmbuzia@gmail.com
- **LinkedIn:** [in/raghad-murad](http://linkedin.com/in/raghad-murad-02690433a)

---

### Thank you for checking out this project! 🚀

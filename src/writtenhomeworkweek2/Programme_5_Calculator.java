package writtenhomeworkweek2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {
    //static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }

    public static int substraction(int a, int b) {
        return a - b;
    }

    //instance methods
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please and second number : ");
        int b = scanner.nextInt();
        addition(a, b);
        int subResult = substraction(a, b);
        System.out.println("The substraction of " + a + " and " + b + " is : " + subResult);

        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        //closing the scanner object
        scanner.close();
    }
}

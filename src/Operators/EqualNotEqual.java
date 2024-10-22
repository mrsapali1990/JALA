package Operators;

import java.util.Scanner;

public class EqualNotEqual {
	public static void main(String[] args) {
        /* To get the instance of Java Scanner which reads input from the user,
         we need to pass the input stream (System.in) in the constructor of Scanner class. */
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number : ");
        // "nextInt()" scans the next token of the input as an Int.
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
        //equal operator (==)
        if (a == b) {
            System.out.println("Both are numbers equal");
        }
        //not equal operator (!=)
        else if (a != b) {
            System.out.println("Both are numbers different");
        }
    }
}

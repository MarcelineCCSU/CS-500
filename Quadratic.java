//********************************************************************
//  Quadratic.java       Author: Modified from the textbook
//
//  Demonstrates the use of the Math class to perform a calculation
//  based on user input.
//********************************************************************

import java.util.Scanner;

public class Quadratic
{
   //-----------------------------------------------------------------
   //  Determines the roots of a quadratic equation.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      double a, b, c;  // ax^2 + bx + c
      double discriminant, root1, root2;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the coefficient of x squared: ");
      a = scan.nextDouble();

      System.out.print("Enter the coefficient of x: ");
      b = scan.nextDouble();

      System.out.print("Enter the constant: ");
      c = scan.nextDouble();

      // Use the quadratic formula to compute the roots.
      // Assumes a positive discriminant.
      
      discriminant = b*b - (4 * a * c);

      root1 = ( -b + Math.sqrt(discriminant) ) / (2 * a);
      root2 = ( -b - Math.sqrt(discriminant) ) / (2 * a);

      System.out.println("Root #1: " + root1);
      System.out.println("Root #2: " + root2);
   }
}

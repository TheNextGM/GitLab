/******************
* Nolan Carter    *
* Sept. 18th 2014 *
******************/

import java.util.Scanner;

public class CalculatorLabApp {
   public static void main (String[]   args){
   
      CalculatorLab myCalculator = new CalculatorLab();
      Scanner input = new Scanner(System.in);
      System.out.print("State two numbers: ");
      int lhs = input.nextInt();
      int rhs = input.nextInt();
      System.out.printf("Number 1: %d%n", lhs);
      System.out.printf("Number 2: %d%n", rhs);
      
      System.out.printf("%nSum: " +
         myCalculator.add(lhs, rhs));
      System.out.printf("%nDifference: " +
         myCalculator.subtract(lhs, rhs));
      System.out.printf("%nProduct: " +
         myCalculator.multiply(lhs, rhs));   
   }
}
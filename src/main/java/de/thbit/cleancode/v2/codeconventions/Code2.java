package de.thbit.cleancode.v2.codeconventions;

public class Code2 {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static void main(String[] args) {
    if (ADDITION.equals(args[2])) {
      int r1 = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
      System.out.println("The result of Addition is: " + r1);
    }
    if (SUBTRACTION.equals(args[2])) {
      int r2 = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
      System.out.println("The result of Subtraction is: " + r2);
    }
    if (MULTIPLICATION.equals(args[2])) {
      int r3 = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
      System.out.println("The result of Multiplication is: " + r3);
    }
    if (DIVISION.equals(args[2])) {
      int r4 = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
      System.out.println("The result of Division is: " + r4);
    }
    if (REMAINDER.equals(args[2])) {
      int r5 = Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
      System.out.println("The result of Remainder is: " + r5);
    }
  }
}
package de.thbit.cleancode.v4.iosp;

public class Calculator {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static void main(String[] args) {
    final int firstOperand = Integer.parseInt(args[0]);
    final int secondOperand = Integer.parseInt(args[1]);
    final String operation = args[2];

    if (ADDITION.equals(operation)) {
      final int additionResult = add(firstOperand, secondOperand);
      printResult(ADDITION, additionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = subtract(firstOperand, secondOperand);
      printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = multiply(firstOperand, secondOperand);
      printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = divide(firstOperand, secondOperand);
      printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = calculateRemainder(firstOperand, secondOperand);
      printResult(REMAINDER, remainderResult);
    }
  }

  private static int add(final int firstOperand, final int secondOperand) {
    return firstOperand + secondOperand;
  }

  private static int subtract(final int firstOperand, final int secondOperand) {
    return firstOperand - secondOperand;
  }

  private static int multiply(final int firstOperand, final int secondOperand) {
    return firstOperand * secondOperand;
  }

  private static int divide(final int firstOperand, final int secondOperand) {
    return firstOperand / secondOperand;
  }

  private static int calculateRemainder(final int firstOperand, final int secondOperand) {
    return firstOperand % secondOperand;
  }

  private static void printResult(String operation, int result) {
    System.out.println("The result of " + operation + " is: " + result);
  }
}

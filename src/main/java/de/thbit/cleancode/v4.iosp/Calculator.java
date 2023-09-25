package de.thb.cleancode.v4.iosp;

public class Calculator {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static void main(String[] args) {
    final int firstNumber = Integer.parseInt(args[0]);
    final int secondNumber = Integer.parseInt(args[1]);
    final String operation = args[2];

    if (ADDITION.equals(operation)) {
      final int addidtionResult = add(firstNumber, secondNumber);
      printResult(ADDITION, addidtionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = subtract(firstNumber, secondNumber);
      printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = multiply(firstNumber, secondNumber);
      printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = divide(firstNumber, secondNumber);
      printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = calculateRemainder(firstNumber, secondNumber);
      printResult(REMAINDER, remainderResult);
    }
  }

  private static int add(final int firstNumber, final int secondNumber) {
    return firstNumber + secondNumber;
  }

  private static int subtract(final int firstNumber, final int secondNumber) {
    return firstNumber - secondNumber;
  }

  private static int multiply(final int firstNumber, final int secondNumber) {
    return firstNumber * secondNumber;
  }

  private static int divide(final int firstNumber, final int secondNumber) {
    return firstNumber / secondNumber;
  }

  private static int calculateRemainder(final int firstNumber, final int secondNumber) {
    return firstNumber % secondNumber;
  }

  private static void printResult(String operation, int result) {
    System.out.println("The result of " + operation + " is: " + result);
  }
}

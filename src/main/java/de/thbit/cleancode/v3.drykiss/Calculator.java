package de.thb.cleancode;

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
      final int addidtionResult = firstNumber + secondNumber;
      printResult(ADDITION, addidtionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = firstNumber - secondNumber;
      printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = firstNumber * secondNumber;
      printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = firstNumber / secondNumber;
      printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = firstNumber % secondNumber;
      printResult(REMAINDER, remainderResult);
    }
  }

  private static void printResult(String operation, int result) {
    System.out.println("The result of " + operation + " is: " + result);
  }
}

package de.thbit.cleancode.v3.drykiss;

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
      final int additionResult = firstOperand + secondOperand;
      printResult(ADDITION, additionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = firstOperand - secondOperand;
      printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = firstOperand * secondOperand;
      printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = firstOperand / secondOperand;
      printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = firstOperand % secondOperand;
      printResult(REMAINDER, remainderResult);
    }
  }

  private static void printResult(String operation, int result) {
    System.out.println("The result of " + operation + " is: " + result);
  }
}

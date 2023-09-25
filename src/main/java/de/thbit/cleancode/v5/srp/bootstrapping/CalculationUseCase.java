package de.thbit.cleancode.v5.srp.bootstrapping;

import de.thbit.cleancode.v5.srp.CalculationService;

public class CalculationUseCase {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static int calculate(String operation, int firstNumber, int secondNumber) {
    if (ADDITION.equals(operation)) {
      return CalculationService.add(firstNumber, secondNumber);
    }
    if (SUBTRACTION.equals(operation)) {
      return CalculationService.subtract(firstNumber, secondNumber);
    }
    if (MULTIPLICATION.equals(operation)) {
      return CalculationService.multiply(firstNumber, secondNumber);
    }
    if (DIVISION.equals(operation)) {
      return CalculationService.divide(firstNumber, secondNumber);
    }
    if (REMAINDER.equals(operation)) {
      return CalculationService.calculateRemainder(firstNumber, secondNumber);
    }
    throw new UnsupportedOperationException(operation);
  }
}

package de.thbit.cleancode.v5.srp.bootstrapping;

import de.thbit.cleancode.v5.srp.CalculationService;

public class CalculationUseCase {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static int calculate(String operation, int firstOperand, int secondOperand) {
    if (ADDITION.equals(operation)) {
      return CalculationService.add(firstOperand, secondOperand);
    }
    if (SUBTRACTION.equals(operation)) {
      return CalculationService.subtract(firstOperand, secondOperand);
    }
    if (MULTIPLICATION.equals(operation)) {
      return CalculationService.multiply(firstOperand, secondOperand);
    }
    if (DIVISION.equals(operation)) {
      return CalculationService.divide(firstOperand, secondOperand);
    }
    if (REMAINDER.equals(operation)) {
      return CalculationService.calculateRemainder(firstOperand, secondOperand);
    }
    throw new UnsupportedOperationException(operation);
  }
}

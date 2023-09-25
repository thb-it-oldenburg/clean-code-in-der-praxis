package de.thbit.cleancode.v6.dip;

public class CalculationUseCase {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  private final CalculationService calculationService;

  public CalculationUseCase(CalculationService calculationService) {
    this.calculationService = calculationService;
  }

  public int calculate(String operation, int firstNumber, int secondNumber) {
    if (ADDITION.equals(operation)) {
      return calculationService.add(firstNumber, secondNumber);
    }
    if (SUBTRACTION.equals(operation)) {
      return calculationService.subtract(firstNumber, secondNumber);
    }
    if (MULTIPLICATION.equals(operation)) {
      return calculationService.multiply(firstNumber, secondNumber);
    }
    if (DIVISION.equals(operation)) {
      return calculationService.divide(firstNumber, secondNumber);
    }
    if (REMAINDER.equals(operation)) {
      return calculationService.calculateRemainder(firstNumber, secondNumber);
    }
    throw new UnsupportedOperationException(operation);
  }
}

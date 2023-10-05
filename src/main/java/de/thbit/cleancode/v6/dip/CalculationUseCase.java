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

  public int calculate(String operation, int firstOperand, int secondOperand) {
    if (ADDITION.equals(operation)) {
      return calculationService.add(firstOperand, secondOperand);
    }
    if (SUBTRACTION.equals(operation)) {
      return calculationService.subtract(firstOperand, secondOperand);
    }
    if (MULTIPLICATION.equals(operation)) {
      return calculationService.multiply(firstOperand, secondOperand);
    }
    if (DIVISION.equals(operation)) {
      return calculationService.divide(firstOperand, secondOperand);
    }
    if (REMAINDER.equals(operation)) {
      return calculationService.calculateRemainder(firstOperand, secondOperand);
    }
    throw new UnsupportedOperationException(operation);
  }
}

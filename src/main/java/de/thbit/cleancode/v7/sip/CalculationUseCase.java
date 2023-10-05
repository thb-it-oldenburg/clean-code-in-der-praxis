package de.thbit.cleancode.v7.sip;

public class CalculationUseCase {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  private final Addition addition;
  private final Subtraction subtraction;
  private final Multiplication multiplication;
  private final Division division;
  private final Remainder remainder;

  public CalculationUseCase(
      Addition addition,
      Subtraction subtraction,
      Multiplication multiplication,
      Division division,
      Remainder remainder) {
    this.addition = addition;
    this.subtraction = subtraction;
    this.multiplication = multiplication;
    this.division = division;
    this.remainder = remainder;
  }

  public int calculate(String operation, int firstOperand, int secondOperand) {
    if (ADDITION.equals(operation)) {
      return addition.add(firstOperand, secondOperand);
    }
    if (SUBTRACTION.equals(operation)) {
      return subtraction.subtract(firstOperand, secondOperand);
    }
    if (MULTIPLICATION.equals(operation)) {
      return multiplication.multiply(firstOperand, secondOperand);
    }
    if (DIVISION.equals(operation)) {
      return division.divide(firstOperand, secondOperand);
    }
    if (REMAINDER.equals(operation)) {
      return remainder.calculateRemainder(firstOperand, secondOperand);
    }
    throw new UnsupportedOperationException(operation);
  }
}

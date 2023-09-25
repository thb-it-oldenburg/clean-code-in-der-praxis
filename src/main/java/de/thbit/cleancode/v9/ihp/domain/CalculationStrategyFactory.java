package de.thbit.cleancode.v9.ihp.domain;

public class CalculationStrategyFactory {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static CalculationStrategy create(String operation) {
    if (ADDITION.equals(operation)) {
      return new Addition();
    }
    if (SUBTRACTION.equals(operation)) {
      return new Subtraction();
    }
    if (MULTIPLICATION.equals(operation)) {
      return new Multiplication();
    }
    if (DIVISION.equals(operation)) {
      return new Division();
    }
    if (REMAINDER.equals(operation)) {
      return new Remainder();
    }
    throw new UnsupportedOperationException(operation);
  }
}

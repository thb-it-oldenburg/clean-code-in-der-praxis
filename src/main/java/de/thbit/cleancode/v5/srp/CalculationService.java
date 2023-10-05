package de.thbit.cleancode.v5.srp;

public class CalculationService {
  public static int add(final int firstOperand, final int secondOperand) {
    return firstOperand + secondOperand;
  }

  public static int subtract(final int firstOperand, final int secondOperand) {
    return firstOperand - secondOperand;
  }

  public static int multiply(final int firstOperand, final int secondOperand) {
    return firstOperand * secondOperand;
  }

  public static int divide(final int firstOperand, final int secondOperand) {
    return firstOperand / secondOperand;
  }

  public static int calculateRemainder(final int firstOperand, final int secondOperand) {
    return firstOperand % secondOperand;
  }
}

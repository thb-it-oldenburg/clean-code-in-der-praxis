package de.thbit.cleancode.v7.sip;

public class CalculationService implements Addition, Subtraction, Multiplication, Division, Remainder {
  @Override
  public int add(final int firstOperand, final int secondOperand) {
    return firstOperand + secondOperand;
  }

  @Override
  public int subtract(final int firstOperand, final int secondOperand) {
    return firstOperand - secondOperand;
  }

  @Override
  public int multiply(final int firstOperand, final int secondOperand) {
    return firstOperand * secondOperand;
  }

  @Override
  public int divide(final int firstOperand, final int secondOperand) {
    return firstOperand / secondOperand;
  }

  @Override
  public int calculateRemainder(final int firstOperand, final int secondOperand) {
    return firstOperand % secondOperand;
  }
}

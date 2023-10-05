package de.thbit.cleancode.v6.dip;

public class CalculationServiceImpl implements CalculationService {
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

package de.thbit.cleancode.v6.dip;

public class CalculationServiceImpl implements CalculationService {
  @Override
  public int add(final int firstNumber, final int secondNumber) {
    return firstNumber + secondNumber;
  }

  @Override
  public int subtract(final int firstNumber, final int secondNumber) {
    return firstNumber - secondNumber;
  }

  @Override
  public int multiply(final int firstNumber, final int secondNumber) {
    return firstNumber * secondNumber;
  }

  @Override
  public int divide(final int firstNumber, final int secondNumber) {
    return firstNumber / secondNumber;
  }

  @Override
  public int calculateRemainder(final int firstNumber, final int secondNumber) {
    return firstNumber % secondNumber;
  }
}

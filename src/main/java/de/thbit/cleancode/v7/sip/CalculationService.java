package de.thbit.cleancode.v7.sip;

public class CalculationService implements Addition, Subtraction, Multiplication, Division, Remainder {
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

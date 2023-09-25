package de.thbit.cleancode.v9.ihp.domain;

class Subtraction implements CalculationStrategy {
  public int calculate(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }
}
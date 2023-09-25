package de.thbit.cleancode.v9.ihp.domain;

class Addition implements CalculationStrategy {
  public int calculate(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
}
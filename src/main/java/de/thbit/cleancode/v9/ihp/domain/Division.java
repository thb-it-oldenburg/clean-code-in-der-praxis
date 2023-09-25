package de.thbit.cleancode.v9.ihp.domain;

class Division implements CalculationStrategy {
  public int calculate(int firstNumber, int secondNumber) {
    return firstNumber / secondNumber;
  }
}
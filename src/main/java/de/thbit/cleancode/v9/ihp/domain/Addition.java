package de.thbit.cleancode.v9.ihp.domain;

class Addition implements CalculationStrategy {
  public int calculate(int firstOperand, int secondOperand) {
    return firstOperand + secondOperand;
  }
}
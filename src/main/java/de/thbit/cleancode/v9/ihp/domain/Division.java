package de.thbit.cleancode.v9.ihp.domain;

class Division implements CalculationStrategy {
  public int calculate(int firstOperand, int secondOperand) {
    return firstOperand / secondOperand;
  }
}
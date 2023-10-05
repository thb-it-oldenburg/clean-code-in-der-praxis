package de.thbit.cleancode.v9.ihp.domain;

class Multiplication implements CalculationStrategy {
  public int calculate(int firstOperand, int secondOperand) {
    return firstOperand * secondOperand;
  }
}
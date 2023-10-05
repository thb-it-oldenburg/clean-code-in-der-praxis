package de.thbit.cleancode.v8.strategy;

public class Remainder implements CalculationStrategy {
  public int calculate(int firstOperand, int secondOperand) {
    return firstOperand % secondOperand;
  }
}
package de.thbit.cleancode.v8.strategy;

public class Addition implements CalculationStrategy {
  public int calculate(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
}
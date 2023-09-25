package de.thbit.cleancode.v8.strategy;

public class CalculationUseCase {
  public int calculate(String operation, int firstNumber, int secondNumber) {
    return CalculationStrategyFactory.create(operation).calculate(firstNumber, secondNumber);
  }
}

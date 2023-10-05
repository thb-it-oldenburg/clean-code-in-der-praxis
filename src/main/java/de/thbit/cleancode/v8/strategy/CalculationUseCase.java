package de.thbit.cleancode.v8.strategy;

public class CalculationUseCase {
  public int calculate(String operation, int firstOperand, int secondOperand) {
    return CalculationStrategyFactory.create(operation).calculate(firstOperand, secondOperand);
  }
}

package de.thbit.cleancode.v9.ihp.application;

import de.thbit.cleancode.v8.strategy.CalculationStrategyFactory;

public class CalculationUseCase {
  public int calculate(String operation, int firstOperand, int secondOperand) {
    return CalculationStrategyFactory.create(operation).calculate(firstOperand, secondOperand);
  }
}

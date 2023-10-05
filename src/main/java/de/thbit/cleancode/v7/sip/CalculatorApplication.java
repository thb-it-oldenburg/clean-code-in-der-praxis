package de.thbit.cleancode.v7.sip;

import de.thbit.cleancode.v5.srp.ArgumentParser;
import de.thbit.cleancode.v5.srp.ConsoleResultPrinter;

public class CalculatorApplication {
  public static void main(String[] args) {
    final CalculationService calculationService = new CalculationService();
    final CalculationUseCase calculationUseCase = new CalculationUseCase(calculationService, calculationService,
        calculationService, calculationService, calculationService);
    final int firstOperand = ArgumentParser.parseFirstOperand(args);
    final int secondOperand = ArgumentParser.parseSecondOperand(args);
    final String operation = ArgumentParser.parseOperation(args);

    final int result = calculationUseCase.calculate(operation, firstOperand, secondOperand);
    ConsoleResultPrinter.printResult(operation, result);
  }
}
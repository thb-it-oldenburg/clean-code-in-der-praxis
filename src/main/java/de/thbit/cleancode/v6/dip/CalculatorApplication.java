package de.thbit.cleancode.v6.dip;

import de.thbit.cleancode.v5.srp.ArgumentParser;
import de.thbit.cleancode.v5.srp.ConsoleResultPrinter;

public class CalculatorApplication {
  public static void main(String[] args) {
    final CalculationService calculationService = new CalculationServiceImpl();
    final CalculationUseCase calculationUseCase = new CalculationUseCase(calculationService);
    final int firstNumber = ArgumentParser.parseFirstNumber(args);
    final int secondNumber = ArgumentParser.parseSecondNumber(args);
    final String operation = ArgumentParser.parseOperation(args);

    final int result = calculationUseCase.calculate(operation, firstNumber, secondNumber);
    ConsoleResultPrinter.printResult(operation, result);
  }
}
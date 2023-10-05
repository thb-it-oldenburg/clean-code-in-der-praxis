package de.thbit.cleancode.v9.ihp;

import de.thbit.cleancode.v5.srp.ArgumentParser;
import de.thbit.cleancode.v5.srp.ConsoleResultPrinter;
import de.thbit.cleancode.v9.ihp.application.CalculationUseCase;

public class CalculatorApplication {
  public static void main(String[] args) {
    final CalculationUseCase calculationUseCase = new CalculationUseCase();
    final int firstOperand = ArgumentParser.parseFirstOperand(args);
    final int secondOperand = ArgumentParser.parseSecondOperand(args);
    final String operation = ArgumentParser.parseOperation(args);

    final int result = calculationUseCase.calculate(operation, firstOperand, secondOperand);
    ConsoleResultPrinter.printResult(operation, result);
  }
}
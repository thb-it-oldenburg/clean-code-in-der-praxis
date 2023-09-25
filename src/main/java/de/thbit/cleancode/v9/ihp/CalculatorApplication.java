package de.thbit.cleancode.v9.ihp;

import de.thbit.cleancode.v5.srp.ArgumentParser;
import de.thbit.cleancode.v5.srp.ConsoleResultPrinter;
import de.thbit.cleancode.v9.ihp.application.CalculationUseCase;

public class CalculatorApplication {
  public static void main(String[] args) {
    final CalculationUseCase calculationUseCase = new CalculationUseCase();
    final int firstNumber = ArgumentParser.parseFirstNumber(args);
    final int secondNumber = ArgumentParser.parseSecondNumber(args);
    final String operation = ArgumentParser.parseOperation(args);

    final int result = calculationUseCase.calculate(operation, firstNumber, secondNumber);
    ConsoleResultPrinter.printResult(operation, result);
  }
}
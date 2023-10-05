package de.thbit.cleancode.v5.srp.bootstrapping;

import de.thbit.cleancode.v5.srp.ArgumentParser;
import de.thbit.cleancode.v5.srp.ConsoleResultPrinter;

public class CalculatorApplication {
  public static void main(String[] args) {
    final int firstOperand = ArgumentParser.parseFirstOperand(args);
    final int secondOperand = ArgumentParser.parseSecondOperand(args);
    final String operation = ArgumentParser.parseOperation(args);

    final int result = CalculationUseCase.calculate(operation, firstOperand, secondOperand);
    ConsoleResultPrinter.printResult(operation, result);
  }
}
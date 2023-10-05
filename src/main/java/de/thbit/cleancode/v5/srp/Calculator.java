package de.thbit.cleancode.v5.srp;

public class Calculator {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static void main(String[] args) {
    final int firstOperand = ArgumentParser.parseFirstOperand(args);
    final int secondOperand = ArgumentParser.parseSecondOperand(args);
    final String operation = ArgumentParser.parseOperation(args);

    if (ADDITION.equals(operation)) {
      final int additionResult = CalculationService.add(firstOperand, secondOperand);
      ConsoleResultPrinter.printResult(ADDITION, additionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = CalculationService.subtract(firstOperand, secondOperand);
      ConsoleResultPrinter.printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = CalculationService.multiply(firstOperand, secondOperand);
      ConsoleResultPrinter.printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = CalculationService.divide(firstOperand, secondOperand);
      ConsoleResultPrinter.printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = CalculationService.calculateRemainder(firstOperand, secondOperand);
      ConsoleResultPrinter.printResult(REMAINDER, remainderResult);
    }
  }
}
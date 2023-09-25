package de.thbit.cleancode.v5.srp;

public class Calculator {
  private static final String REMAINDER = "Remainder";
  private static final String DIVISION = "Division";
  private static final String MULTIPLICATION = "Multiplication";
  private static final String SUBTRACTION = "Subtraction";
  private static final String ADDITION = "Addition";

  public static void main(String[] args) {
    final int firstNumber = ArgumentParser.parseFirstNumber(args);
    final int secondNumber = ArgumentParser.parseSecondNumber(args);
    final String operation = ArgumentParser.parseOperation(args);

    if (ADDITION.equals(operation)) {
      final int addidtionResult = CalculationService.add(firstNumber, secondNumber);
      ConsoleResultPrinter.printResult(ADDITION, addidtionResult);
    }
    if (SUBTRACTION.equals(operation)) {
      final int subtractionResult = CalculationService.subtract(firstNumber, secondNumber);
      ConsoleResultPrinter.printResult(SUBTRACTION, subtractionResult);
    }
    if (MULTIPLICATION.equals(operation)) {
      final int multiplicationResult = CalculationService.multiply(firstNumber, secondNumber);
      ConsoleResultPrinter.printResult(MULTIPLICATION, multiplicationResult);
    }
    if (DIVISION.equals(operation)) {
      final int divisionResult = CalculationService.divide(firstNumber, secondNumber);
      ConsoleResultPrinter.printResult(DIVISION, divisionResult);
    }
    if (REMAINDER.equals(operation)) {
      final int remainderResult = CalculationService.calculateRemainder(firstNumber, secondNumber);
      ConsoleResultPrinter.printResult(REMAINDER, remainderResult);
    }
  }
}
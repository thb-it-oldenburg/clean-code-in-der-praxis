package de.thbit.cleancode.v6.dip;

public interface CalculationService {

  int add(int firstOperand, int secondOperand);

  int subtract(int firstOperand, int secondOperand);

  int multiply(int firstOperand, int secondOperand);

  int divide(int firstOperand, int secondOperand);

  int calculateRemainder(int firstOperand, int secondOperand);

}
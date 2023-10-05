package de.thbit.cleancode.v8.strategy;

public class ArgumentParser {
  public static int parseFirstOperand(String[] args) {
    return Integer.parseInt(args[0]);
  }

  public static int parseSecondOperand(String[] args) {
    return Integer.parseInt(args[1]);
  }

  public static String parseOperation(String[] args) {
    return args[2];
  }
}

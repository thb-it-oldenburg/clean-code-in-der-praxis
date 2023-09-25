package de.thbit.cleancode.v9.ihp.ui;

class ArgumentParser {
  public static int parseFirstNumber(String[] args) {
    return Integer.parseInt(args[0]);
  }

  public static int parseSecondNumber(String[] args) {
    return Integer.parseInt(args[1]);
  }

  public static String parseOperation(String[] args) {
    return args[2];
  }
}

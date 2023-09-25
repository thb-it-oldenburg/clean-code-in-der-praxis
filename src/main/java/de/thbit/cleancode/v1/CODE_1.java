package de.thbit.cleancode.v1;

public class CODE_1 {
  public static void main(String[] args) {
    int R_1, R_2, R_3, R_4, R_5;
    if (args[2].equals("Addition")) {
      R_1 = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
      System.out.println("The result of Addition is: " + R_1);
    }
    if (args[2].equals("Subtraction")) {
      R_2 = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
      System.out.println("The result of Subtraction is: " + R_2);
    }
    if (args[2].equals("Multiplication")) {
      R_3 = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
      System.out.println("The result of Multiplication is: " + R_3);
    }
    if (args[2].equals("Division")) {
      R_4 = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
      System.out.println("The result of Division is: " + R_4);
    }
    if (args[2].equals("Remainder")) {
      R_5 = Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
      System.out.println("The result of Remainder is: " + R_5);
    }
  }
}

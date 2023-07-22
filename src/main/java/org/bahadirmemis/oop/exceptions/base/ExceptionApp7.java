package org.bahadirmemis.oop.exceptions.base;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp7 {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Value:");
    int value1 = scanner.nextInt();

    System.out.println("Second Value: ");
    int value2 = scanner.nextInt();

    try {
      int result = divide(value1, value2);
      System.out.println(result);
    } catch (Exception e){
      System.out.println("hiçbir şey yapmıyorum");
    }

    int result = divide(value1, value2);

    System.out.println("Divide: " + result);
  }

  private static int divide(int value1, int value2) throws Exception {
    if (value2 == 0){
      throw new Exception("Second Value cannot be zero");
    }

    int result = value1 / value2;
    return result;
  }
}

package org.bahadirmemis.oop.exceptions;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp10 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Value:");
    int value1 = scanner.nextInt();

    System.out.println("Second Value: ");
    int value2 = scanner.nextInt();

    int result;
    try {
      result = divide(value1, value2);
      System.out.println("başarılı");
    } catch (Exception e){
      result = 0;
      System.out.println("başarısız");
    } finally {
      System.out.println("finally");
    }

    System.out.println(result);
  }

  private static int divide(int value1, int value2) {
    if (value2 == 0){
      throw new RuntimeException("Second Value cannot be zero");
    }

    int result = value1 / value2;
    return result;
  }
}

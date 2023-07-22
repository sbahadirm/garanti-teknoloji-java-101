package org.bahadirmemis.oop.exceptions;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp9 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Value:");
    int value1 = scanner.nextInt();

    System.out.println("Second Value: ");
    int value2 = scanner.nextInt();

    divideAndPrint(value1, value2);
  }

  private static void divideAndPrint(int value1, int value2) {
    
    int result = printInfoAndDivide(value1, value2);

    System.out.println("Divide: " + result);
  }

  private static int printInfoAndDivide(int value1, int value2) {

    int result = divide(value1, value2);

    System.out.println("Returning Result...");
    return result;
  }

  private static int divide(int value1, int value2) {
    if (value2 == 0){
      throw new RuntimeException("Second Value cannot be zero");
    }

    int result = value1 / value2;
    return result;
  }
}

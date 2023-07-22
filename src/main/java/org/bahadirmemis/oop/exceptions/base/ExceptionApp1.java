package org.bahadirmemis.oop.exceptions.base;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp1 {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Value:");
    int value1 = scanner.nextInt();

    System.out.println("Second Value: ");
    int value2 = scanner.nextInt();

    if (value2 == 0){
      throw new Exception("Second Value cannot be zero");
    }

    int result = value1 / value2;
    System.out.println("Divide: " + result);
  }
}

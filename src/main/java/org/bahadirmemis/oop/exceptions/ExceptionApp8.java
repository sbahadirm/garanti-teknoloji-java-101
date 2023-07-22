package org.bahadirmemis.oop.exceptions;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp8 {

  public static void main(String[] args) {

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

    // ya sarmalayacağız ya da method a throws yazacağız!!!
    //int result = divide(value1, value2);

    //System.out.println("Divide: " + result);
  }

  private static int divide(int value1, int value2) throws Exception {
    if (value2 == 0){
      throw new Exception("Second Value cannot be zero");
    }

    int result = value1 / value2;
    return result;
  }
}

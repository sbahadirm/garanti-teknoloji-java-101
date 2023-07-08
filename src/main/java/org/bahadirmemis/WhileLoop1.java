package org.bahadirmemis;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class WhileLoop1 {

  public static void main(String[] args) {

    boolean isPassive = true;

    Scanner scanner = new Scanner(System.in);
    while (isPassive){

      System.out.println("Enter your command: ");
      String value = scanner.nextLine();
      if ("activate".equals(value)){
        System.out.println("...");
        isPassive = false;
      }
    }

    System.out.println("System is active now!");
  }
}

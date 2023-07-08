package org.bahadirmemis;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class DoWhileLoop {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String nextLine = "";
    //do {
    //  nextLine = scanner.nextLine();
    //} while ("q".equals(nextLine));

    boolean parameter = false;

    //while (parameter){
    //  nextLine = scanner.nextLine();
    //}

    do {
      nextLine = scanner.nextLine();
      parameter = !"q".equals(nextLine);
    } while (parameter);

    System.out.println(nextLine);
  }
}

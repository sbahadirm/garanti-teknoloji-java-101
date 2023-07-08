package org.bahadirmemis;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class GettingData {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bir değer giriniz");
    String s1 = scanner.nextLine();

    int int1 = scanner.nextInt();

    System.out.println("Girdiğiniz değerler: " + s1 + ", " + int1);

  }
}

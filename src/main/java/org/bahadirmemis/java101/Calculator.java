package org.bahadirmemis.java101;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class Calculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Birinci sayıyı giriniz:");
    int i1 = scanner.nextInt();
    System.out.println("İkinci sayıyı giriniz:");
    int i2 = scanner.nextInt();

    int total = i1 + i2;
    System.out.println("Toplam: " + total);
  }
}

package org.bahadirmemis.oop.exceptions.custom;

import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class ExceptionApp12 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Value:");
    int value1 = scanner.nextInt();

    System.out.println("Second Value: ");
    int value2 = scanner.nextInt();

    try {
      int result = divide(value1, value2);
      System.out.println(result);
    } catch (ArithmeticException e){
      System.out.println("Errorrrrrrr -> a");
    } catch (RuntimeException e){
      System.out.println("Errorrrrrrr -> r");
    } catch (Exception e){
      System.out.println("Errorrrrrrr -> e");
    }
  }

  private static int divide(int value1, int value2) throws MalformedURLException {
    if (value2 == 0){
      //throw new RuntimeException();
      //throw new GarantiTechBusinessException();
      throw new GarantiTechBusinessException("Second Value cannot be zero");
    }

    int result = value1 / value2;
    return result;
  }
}

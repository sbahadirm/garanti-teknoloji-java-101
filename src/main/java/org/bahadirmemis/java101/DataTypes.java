package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class DataTypes {

  public static void main(String[] args) {

    int number1 = 999;
    int number2 = 11111;

    //int number1 = 2147483647;
    //int number2 = 1;

    int total = number1 + number2;

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(total);

    long number3 = 45L;

    long total2 = number3 + 66L;

    System.out.println(number3);
    System.out.println(total2);

    boolean isActive = true;

    System.out.println(isActive);

    char char1 = 's';
    char char2 = 'b';
    char char3 = 'm';
    String sbm = String.valueOf(char1 + char2 + char3);

    System.out.println(char1);
    System.out.println(char2);
    System.out.println(char3);

    System.out.println("char1: " + char1);
    System.out.println("char2: " + char2);
    System.out.println("char3: " + char3);
    System.out.println("" + char1 + char2 + char3);
    System.out.println(sbm);

    System.out.println((int) char1);
    System.out.println((int) char2);
    System.out.println((int) char3);

    System.out.println();
    System.out.println("Aşağıdakilere dikkat!");
    System.out.println(char1 + char2 + char3);
    System.out.println(number1 + number2);
    System.out.println("Birleşim: " + number1 + number2);
    System.out.println("Toplam: " + (number1 + number2));

  }
}

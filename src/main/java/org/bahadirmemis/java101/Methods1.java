package org.bahadirmemis.java101;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class Methods1 {

  public static void main(String[] args) {

    // x bir tam sayıdır.
    // f1(x) = 5x + 3
    // f1(3) = 5x3 + 3 = 18

    Scanner scanner = new Scanner(System.in);

    System.out.println("x i giriniz!");
    int x = scanner.nextInt();

    //int result = f1(x);

    // f2(x,y) = 2x + 3y + 1

    System.out.println("y yi giriniz!");
    int y = scanner.nextInt();

    int result = f2(x,y);

    System.out.println(result);

  }

  public static int f1(int x){
    int result = 5*x + 3;
    return result;
  }

  public static int f2(int x, int y){
    int result = 2*x + 3*y + 1;
    return result;
  }


}

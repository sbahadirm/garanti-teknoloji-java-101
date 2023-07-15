package org.bahadirmemis.java101;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class WhileLoop2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //String s = scanner.nextLine();
    //boolean parameter = true;
    //while (parameter){
    //  if (s == "active"){
    //    System.out.println("system is active now!");
    //  }
    //  System.out.println(s);
    //}

    while (true){
      String nextLine = scanner.nextLine();
      System.out.println(nextLine);
      if ("q".equals(nextLine)){
        System.out.println("quit");
        break;
      }

    }
  }
}

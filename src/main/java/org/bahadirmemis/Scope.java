package org.bahadirmemis;

/**
 * @author bahadirmemis
 */
public class Scope {

  public static void main(String[] args) {

    boolean isFirstName = true;

    //boolean scopeTest = true;

    {
      boolean scopeTest = true;
    }

    if (isFirstName){
      boolean scopeTest = true;
      System.out.println("Sadık");
    } else {
      boolean scopeTest = true;
      System.out.println("Bahadır");
    }

    boolean scopeTest = true;
  }
}

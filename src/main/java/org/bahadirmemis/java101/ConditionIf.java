package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class ConditionIf {

  public static void main(String[] args) {

    boolean isFirstName = true;
    boolean isSecondName = true;
    boolean isCustomer = true;

    if (isSecondName){
      System.out.println("Bahadır");
    } else {
      System.out.println("Sadık");
    }

    if (isCustomer && isFirstName){
      System.out.println("Sadık");
    } else {
      System.out.println("XXX");
    }

    if (isCustomer && isFirstName){
      System.out.println("Sadık");
    } else if (isCustomer && isSecondName){
      System.out.println("Bahadır");
    } else {
      System.out.println("XXX");
    }

    //if (isCustomer && isFirstName){
    //  System.out.println("Sadık");
    //}
    //
    //if (isCustomer && isSecondName){
    //  System.out.println("Bahadır");
    //}

  }
}

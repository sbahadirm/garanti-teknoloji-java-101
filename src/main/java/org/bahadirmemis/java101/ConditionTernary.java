package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class ConditionTernary {

  public static void main(String[] args) {
    boolean isFirstName = true;
    boolean isSecondName = true;
    boolean isCustomer = false;

    String firstName = isFirstName ? "Sadık" : "Bahadır";
    System.out.println("firstName: " +firstName);

    String secondName = isSecondName ? "Bahadır" : "Sadık";
    System.out.println("secondName: " +secondName);

    String customerFirstName = isCustomer && isFirstName ? "Sadık" : "XXX";
    System.out.println("customerFirstName: " + customerFirstName);
  }
}

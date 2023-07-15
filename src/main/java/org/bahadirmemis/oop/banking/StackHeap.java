package org.bahadirmemis.oop.banking;

/**
 * @author bahadirmemis
 */
public class StackHeap {

  public static void main(String[] args) {

    Customer customerSbm = new Customer();
    customerSbm.id= 1;
    customerSbm.name = "bahadır";
    customerSbm.surname = "memiş";
    customerSbm.identityNo = "123232323";
    customerSbm.emailAddress = "sbahadirm@gmail.com";
    customerSbm.phoneNumber = "05468447654";
    customerSbm.birthDate = "05-10-1991";

    System.out.println(customerSbm.name);

    Customer sbm2 = customerSbm;

    System.out.println(customerSbm.name);
    System.out.println(sbm2.name);

    sbm2.name = "sadık bahadır";
    System.out.println(sbm2.name);
    System.out.println(customerSbm.name);

    customerSbm = null;

    System.out.println(sbm2.name);
    //System.out.println(customerSbm.name); // null pointer
  }
}

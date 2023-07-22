package org.bahadirmemis.oop.encapsulation.app;

import org.bahadirmemis.oop.encapsulation.Customer;
import org.bahadirmemis.oop.encapsulation.Customer2;

/**
 * @author bahadirmemis
 */
public class EncapsulationApp {

  public static void main(String[] args) {

    Customer customer = new Customer();

    System.out.println(customer.getId());
    System.out.println(customer.getName());

    customer.setId(1);
    customer.setName("bahadir");

    System.out.println(customer.getId());
    System.out.println(customer.getName());

    Customer2 customer2 = new Customer2(2, "sadik", "memis",
                                        "121212", "3456734",
                                        "sdsdsd", "3434");

    System.out.println(customer2.getId());
    System.out.println(customer2.getName());

    customer2.setName("Eray");

    System.out.println(customer2.getId());
    System.out.println(customer2.getName());

    Customer2 customer21 = customer2.testThis();
    System.out.println("thisden sonra");

    System.out.println(customer21.getId());
    System.out.println(customer21.getName());
  }
}

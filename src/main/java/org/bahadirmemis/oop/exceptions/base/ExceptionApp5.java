package org.bahadirmemis.oop.exceptions.base;

import org.bahadirmemis.oop.exceptions.helper.Customer;
import org.bahadirmemis.oop.exceptions.helper.Phone;

/**
 * @author bahadirmemis
 */
public class ExceptionApp5 {

  public static void main(String[] args) throws Exception {

    Phone phone1 = new Phone("Samsung");
    Customer bahadir = new Customer("bahadir", "memis", phone1);

    printCustomerPhoneInfos(bahadir);

    Customer berat = new Customer("Berat", "Arslan", null);

    printCustomerPhoneInfos(berat);

    Customer eray = new Customer("Eray", "Akgül", null);
    printCustomerPhoneInfos(eray);

    Phone iphone = new Phone("Iphone");
    Customer melisa = new Customer("Melisa", "Çevik", iphone);
    printCustomerPhoneInfos(melisa);
  }

  private static void printCustomerPhoneInfos(Customer customer) throws Exception {
    if (customer.getPhone() == null) {
      return;
    }
    System.out.println(customer.getName() + "'ın telefonu " + customer.getPhone().getName() + "'dur");
  }

  private static void printCustomerPhonelessInfo(Customer customer) throws Exception {
    System.out.println(customer.getName() + "'ın telefonu " + "yoktur");
  }
}

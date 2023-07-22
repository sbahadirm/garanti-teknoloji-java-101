package org.bahadirmemis.oop.exceptions.base;

import org.bahadirmemis.oop.exceptions.helper.Customer;
import org.bahadirmemis.oop.exceptions.helper.Phone;

/**
 * @author bahadirmemis
 */
public class ExceptionApp3 {

  public static void main(String[] args) throws Exception {

    Phone phone1 = new Phone("Samsung");
    Customer bahadir = new Customer("bahadir", "memis", phone1);

    try {
      printCustomerPhoneInfos(bahadir);
    } catch (Exception e){
      printCustomerPhonelessInfo(bahadir);
    }

    Customer berat = new Customer("Berat", "Arslan", null);

    try {
      printCustomerPhoneInfos(berat);
    } catch (Exception e){
      printCustomerPhonelessInfo(berat);
    }

    Customer eray = new Customer("Eray", "Akgül", null);
    try {
      printCustomerPhoneInfos(eray);
    } catch (Exception e){
      printCustomerPhonelessInfo(eray);
    }

    Phone iphone = new Phone("Iphone");
    Customer melisa = new Customer("Melisa", "Çevik", iphone );
    try {
      printCustomerPhoneInfos(melisa);
    } catch (Exception e){
      printCustomerPhonelessInfo(melisa);
    }
  }

  private static void printCustomerPhoneInfos(Customer customer) throws Exception {
    if (customer.getPhone() == null){
      throw new Exception("Phone cannot be null");
    }
    System.out.println(customer.getName() + "'ın telefonu " + customer.getPhone().getName() + "'dur");
  }

  private static void printCustomerPhonelessInfo(Customer customer) throws Exception {
    System.out.println(customer.getName() + "'ın telefonu " +  "yoktur");
  }
}

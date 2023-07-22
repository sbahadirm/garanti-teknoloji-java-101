package org.bahadirmemis.oop.exceptions.base;

import org.bahadirmemis.oop.exceptions.helper.Customer;
import org.bahadirmemis.oop.exceptions.helper.Phone;

/**
 * @author bahadirmemis
 */
public class ExceptionApp2 {

  public static void main(String[] args) throws Exception {

    Phone phone1 = new Phone("Samsung");
    Customer bahadir = new Customer("bahadir", "memis", phone1);
    printCustomerPhoneInfos(bahadir);

    Customer berat = new Customer("Berat", "Arslan", null);
    //if (berat.getPhone() == null){
    //  throw new Exception("Phone cannot be null");
    //}
    //control(berat);
    printCustomerPhoneInfos(berat);

    Customer eray = new Customer("Eray", "Akgül", null);
    //control(eray);
    printCustomerPhoneInfos(eray);

    Phone iphone = new Phone("Iphone");
    Customer melisa = new Customer("Melisa", "Çevik", iphone );
    //control(eray);
    printCustomerPhoneInfos(melisa);
  }

  private static void printCustomerPhoneInfos(Customer customer) throws Exception {
    if (customer.getPhone() == null){
      throw new Exception("Phone cannot be null");
    }
    System.out.println(customer.getName() + "'ın telefonu " + customer.getPhone().getName() + "'dur");
  }

}

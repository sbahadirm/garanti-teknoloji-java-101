package org.bahadirmemis.oop.accessmodifiers.classbased.pkg1;

import org.bahadirmemis.oop.accessmodifiers.classbased.Address;
import org.bahadirmemis.oop.accessmodifiers.classbased.pkg2.District;

/**
 * @author bahadirmemis
 */
public class City {

  private Country country;
  private District district;
  private Address address;

  private void test(){
    //country.test();
    country.testPublic();
    country.testProtected();
    country.testFriendly();
    System.out.println("Test city");
  }
}

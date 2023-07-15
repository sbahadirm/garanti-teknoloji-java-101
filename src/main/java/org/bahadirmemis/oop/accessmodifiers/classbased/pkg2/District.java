package org.bahadirmemis.oop.accessmodifiers.classbased.pkg2;

import org.bahadirmemis.oop.accessmodifiers.classbased.Address;
import org.bahadirmemis.oop.accessmodifiers.classbased.pkg1.City;
import org.bahadirmemis.oop.accessmodifiers.classbased.pkg1.Country;

/**
 * @author bahadirmemis
 */
public class District {

  private City city;
  private Country country;
  private Address address;

  private void test(){
    country.testPublic();
    //country.testProtected();
    //country.testFriendly();
    System.out.println("Test district");
  }
}

package org.bahadirmemis.oop.accessmodifiers.classbased.pkg2;

import org.bahadirmemis.oop.accessmodifiers.classbased.pkg1.Country;

/**
 * @author bahadirmemis
 */
public class SuperCountry2 extends Country {

  private void testSuperCountry(){
    testPublic();
    testProtected();
    //testFriendly();
    //testPrivate();
    System.out.println("Test super country");
  }
}

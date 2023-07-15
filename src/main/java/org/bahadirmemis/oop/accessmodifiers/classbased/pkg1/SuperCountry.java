package org.bahadirmemis.oop.accessmodifiers.classbased.pkg1;

/**
 * @author bahadirmemis
 */
public class SuperCountry extends Country{

  private void testSuperCountry(){
    testPublic();
    testProtected();
    testFriendly();
    //testPrivate();
    System.out.println("Test super country");
  }
}

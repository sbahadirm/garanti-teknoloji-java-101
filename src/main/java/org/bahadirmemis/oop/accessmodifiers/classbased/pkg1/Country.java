package org.bahadirmemis.oop.accessmodifiers.classbased.pkg1;

/**
 * @author bahadirmemis
 */
public class Country {

  public void testPublic(){
    System.out.println("testPublic");
  }

  private void testPrivate(){
    System.out.println("testPrivate");
  }

  protected void testProtected(){
    System.out.println("testProtected");
  }

  void testFriendly(){
    System.out.println("testFriendly");
  }
}

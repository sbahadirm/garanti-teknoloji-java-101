package org.bahadirmemis.oop.abstraction;

/**
 * @author bahadirmemis
 */
public class OldPhone extends Phone{

  public OldPhone(String brandName, String modelName) {
    super(brandName, modelName);
  }

  @Override
  public void press1() {
    System.out.println("pressed 1");
  }
}

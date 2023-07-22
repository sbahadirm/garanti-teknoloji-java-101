package org.bahadirmemis.oop.abstraction;

/**
 * @author bahadirmemis
 */
public class SmartPhone extends Phone{

  public SmartPhone(String brandName, String modelName) {
    super(brandName, modelName);
  }

  @Override
  public void press1() {
    System.out.println("touched 1");
  }
}
